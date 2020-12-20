package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    private int data;

    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
        // No duplicate value
        if (data == value)
            return;

        if (data > value)
            if (leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);

        if (data < value)
            if (rightChild == null)
                rightChild = new TreeNode(value);
            else
                rightChild.insert(value);
    }

    //BFS
    //In level tree
    public void traverseLevelOrder(){

    }

    //DFS
    //InOrder (Left, Root, Right)
    // PreOrder (Root, Left, Right)
    // PostOrder (Left, Right, Root)
    public void traverseInOrder(){
        if (leftChild!=null)
            leftChild.traverseInOrder();

        System.out.print(data + ", ");
        if (rightChild!=null)
            rightChild.traverseInOrder();
    }

    public void traversePreOrder(){
        System.out.print(data + ", ");

        if (leftChild!=null)
            leftChild.traversePreOrder();

        if (rightChild!=null)
            rightChild.traversePreOrder();

    }

    public TreeNode getValue(int value){
        if (data == value)
            return this;

        if (data > value){
            if (leftChild!=null)
                return leftChild.getValue(value);
        }
        else
            if (rightChild!=null)
                return rightChild.getValue(value);

        return null;
    }

    public int max(){
        if (rightChild == null)
            return data;
        else
            return rightChild.max();
    }

    public int min(){
        if (leftChild == null)
            return data;
        else
            return leftChild.min();
    }

    public void traversePostOrder(){
        if (leftChild!=null)
            leftChild.traversePostOrder();

        if (rightChild!=null)
            rightChild.traversePostOrder();

        System.out.print(data + ", ");

    }


    public void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode removedNode = queue.poll();
            System.out.print(removedNode.data + ", ");

            if (removedNode.leftChild!=null)
                queue.add(removedNode.leftChild);

            if (removedNode.rightChild!=null)
                queue.add(removedNode.rightChild);
        }
    }

    public int height(TreeNode root){
        if (root == null)
            return -1;

        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int heightIterative(TreeNode root){
        if (root == null)
            return -1;

        int height = -1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int size = -1;

        while (!queue.isEmpty()){
            size = queue.size();

            height++;
            while(size > 0){
                TreeNode node = queue.remove();
                if (node.leftChild !=null)
                    queue.add(node.leftChild);

                if (node.rightChild !=null)
                    queue.add(node.rightChild);

                size--;
            }
        }

        return height;
    }

    public TreeNode (int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }
}
