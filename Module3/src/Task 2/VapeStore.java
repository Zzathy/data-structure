import java.util.Scanner;

public class VapeStore {
    private Node front, rear;
    private int size;

    private static class Node {
        String itemName;
        int price;
        Node next;

        public Node(String itemName, int price) {
            this.itemName = itemName;
            this.price = price;
            this.next = null;
        }
    }

    public void enqueue(String itemName, int price) {
        Node node = new Node(itemName, price);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println(itemName + " successfully added");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty queue");
        } else {
            Node node = front;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            System.out.println(node.itemName + " was purchased at price " + node.price);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Next Item: " + front.itemName + ", Price: " + front.price);
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VapeStore vapeStore = new VapeStore();
        int choice;
        while (true) {
            System.out.println(
                    "===Menu===\n1. Add Item\n2. Sell Item\n3. See Next Item\n4. Check Item on Queue\n0. Exit");
            System.out.print("Masukkan Pilihan : ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Input Item Name : ");
                    String itemName = input.nextLine();
                    System.out.print("Input Price : ");
                    int price = input.nextInt();
                    vapeStore.enqueue(itemName, price);
                    break;
                case 2:
                    vapeStore.dequeue();
                    break;
                case 3:
                    vapeStore.peek();
                    break;
                case 4:
                    System.out.println("Total Item on Queue : " + vapeStore.size);
                    break;
                case 0:
                    System.out.println("Program Finished");
                    return;
                default:
                    System.out.println("Choice not valid");
                    break;
            }
        }
    }
}
