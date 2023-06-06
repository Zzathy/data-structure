package Task1;

import java.util.*;

class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        this.root = insertNode(root, data);
    }

    private Node<T> insertNode(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> currentNode = queue.poll();

            if (currentNode.left == null) {
                currentNode.left = new Node<>(data);
                break;
            } else {
                queue.add(currentNode.left);
            }

            if (currentNode.right == null) {
                currentNode.right = new Node<>(data);
                break;
            } else {
                queue.add(currentNode.right);
            }
        }

        return root;
    }

    public void preorderTraversal() {
        preorder(root);
    }

    private void preorder(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node<T> node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private void postorder(Node<T> node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}