public class MainTraining {
    public static void main(String[] args) {
        BinaryTreeTraining pohon = new BinaryTreeTraining();

        // pohon.NewNode(20);
        // pohon.NewNode(2);
        // pohon.NewNode(25);
        // pohon.NewNode(37);
        // pohon.NewNode(16);
        pohon.NewNode(65);
        pohon.NewNode(2);
        pohon.NewNode(73);
        pohon.NewNode(83);
        pohon.NewNode(7);

        System.out.print("\nPre Order : ");
        pohon.preOrder(pohon.root);
        System.out.print("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.print("\nPost Order : ");
        pohon.postOrder(pohon.root);
    }
}
