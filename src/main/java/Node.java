public class Node <T extends Comparable<T>> {
    protected T value;
    protected String name;
    protected Node<T> left;
    protected Node<T> right;


    public Node(T value, String name) {
        this.value = value;
        this.name = name;
    }


    protected void addNode(Node<T> n){
        if(value.compareTo(n.value) > 0) {
            if (left == null) {
                left = n;
            } else {
                left.addNode(n);
            }
        } else {
            if (right == null) {
                right = n;
            } else {
                right.addNode(n);
            }
        }
    }


    public void printTree() {
        printTree("", true);
    }

    private void printTree(String prefix, boolean isTail) {
        if (right != null) {
            right.printTree(prefix + (isTail ? "│   " : "    "), false);
        }

        System.out.println(prefix + (isTail ? "└── " : "┌── ") +value + ": " + name);

        if (left != null) {
            left.printTree(prefix + (isTail ? "    " : "│   "), true);
        }

    }
}

