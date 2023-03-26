package tree;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;
    public void add(T value) {
        if(root == null) root = new Node<T>(value);
        else addInSubTree(value, root);
    }
    private void addInSubTree(T tempVal, Node<T> currentNode) {
        if (tempVal.compareTo(currentNode.getKey()) < 0) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new Node<>(tempVal));
            } else {
                addInSubTree(tempVal, currentNode.getLeft());
            }
        } else if (tempVal.compareTo(currentNode.getKey()) > 0) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(new Node<>(tempVal));
            } else {
                addInSubTree(tempVal, currentNode.getRight());
            }
        }
    }
    public int getHeight(){ return height(root);}
    private int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
    }
}