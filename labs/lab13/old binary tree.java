public class BinaryTree<K extends Comparable<K>, V> {
private Node<K, V> root;

public BinaryTree(Node root) {
        this.root = root;
}

public Node<K, V> getRoot() {
        return this.root;
}

public void add(K key, V value) {
        if (this.root == null) {
                this.root = new Node<K, V>(key, value);
        }
        else {
                this.root.add(key, value);
        }
}
public void printInOrder(Node node) {

        if(node==null) {return;}
        printPreOrder(node.getLeft());
        System.out.println(node.getValue());
        printPreOrder(node.getRight());

}
public void printPreOrder(Node node) {


}

public void printPostOrder(Node node) {

              if(node==null) {return;}
              printInOrder(node.getLeft());
              printInOrder(node.getRight());
              System.out.println(node.getValue());

}
@SuppressWarnings("unchecked")
public V[] flatten() {
        return (V[]) new Object[0];
}

public boolean containsSubtree(BinaryTree<K, V> other) {
        return false;
}

public static void main (String args[]) {
        //Tree given for testing on
        BinaryTree<Integer, String> p1Tree = new BinaryTree<Integer, String>(new Node<Integer, String>(40, "forty",
                                                                                                       new Node<Integer, String>(20, "twenty",
                                                                                                                                 new Node<Integer, String>(10, "ten"), new Node<Integer, String>(30, "thirty")),
                                                                                                       new Node<Integer, String>(60, "sixty",
                                                                                                                                 new Node<Integer, String>(50, "fifty"), new Node<Integer, String>(70, "seventy"))));


         p1Tree.printPostOrder(p1Tree.root);
        //p1Tree.printInOrder(p1Tree.root);
}
}
