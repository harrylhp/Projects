package Tree;

public class MainTree {
    public static void main(String [] args){
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(32);

        System.out.println("Traverse In Order ");
        tree.traverseInOrder();

        System.out.println();
        System.out.println("Traverse Pre Order ");
        tree.traversePreOrder();

        System.out.println();
        System.out.println("Traverse Post Order ");
        tree.traversePostOrder();

        System.out.println();
        /*
        System.out.println("Node is " + tree.get(26).getData());
        System.out.println("Node is " + tree.get(55));

        System.out.println("Min is " + tree.min());
        System.out.println("Max is " + tree.max());
        */

        System.out.println("Traverse Level Order");
        tree.printLevelOrder();

        System.out.println();
        System.out.println("Height of the Tree: " + tree.height());

        System.out.println();
        System.out.println("Height of the Tree(Iterative) : " + tree.heightIterative());
    }
}
