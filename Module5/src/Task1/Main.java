package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] characters = new char[26];
        int value = 26;
        for (int i = 0; i < 26; i++) {
            characters[i] = (char) ('A' + i);
            value--;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input combination (character/number): ");
        String input = scanner.nextLine();

        BinaryTree<Character> binaryTree = new BinaryTree<>();
        for (char ch : input.toCharArray()) {
            int index = Character.toUpperCase(ch) - 'A';
            if (index >= 0 && index < 26) {
                binaryTree.insert(characters[index]);
            } else {
                binaryTree.insert(ch);
            }
        }

        System.out.println("\nPreorder :");
        binaryTree.preorderTraversal();

        System.out.println("\n\nInorder :");
        binaryTree.inorderTraversal();

        System.out.println("\n\nPostorder :");
        binaryTree.postorderTraversal();
    }
}