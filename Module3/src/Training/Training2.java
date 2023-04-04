package Training;

import java.util.LinkedList;
import java.util.Queue;

public class Training2 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("Remove : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());

    }
}
