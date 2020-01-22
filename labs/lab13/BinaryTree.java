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
        printInOrder(node.getLeft());
        System.out.println(node.getValue());
        printInOrder(node.getRight());

}
public void printPreOrder(Node node) {
        if(node==null) {return;}
        System.out.println(node.getValue());
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
}
public void printPostOrder(Node node) {
        if(node==null) {return;}
        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.println(node.getValue());
}
@SuppressWarnings("unchecked")

public V[] flatten() {
        V[] result = (V[]) new Object[7];
        int size = helper(root,0,result);

        return (V[]) new Object[0];
}
public int helper(Node root,int i,Object[] array){
        if(root==null) {return i;}
        i=helper(root.getLeft(),i,array);
        array[i]= root.getValue();
        i=helper(root.getRight(),i+1,array);
        return i;
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

        //System.out.println("In order is: ");
        //  p1Tree.printInOrder(p1Tree.root);
        //  System.out.println("Pre Order is:");
        //    p1Tree.printPreOrder(p1Tree.root);
        //    System.out.println("Post Order is:");
        //    p1Tree.printPostOrder(p1Tree.root);
}
}
