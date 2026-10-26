import java.util.Scanner;

public class Opgave1 {
    static Node<Integer> root;

    public static void run() {
        root = new Node<>(60, "Ryk til dækning");
        root.addNode(new Node<>(85, "Skyd fra dækning"));
        root.addNode(new Node<>(70, "Overwatch"));
        root.addNode(new Node<>(50, "Skyd fra nuværende position"));
        root.addNode(new Node<>(55, "Suppressionsild"));
        root.addNode(new Node<>(75, "Kritisk skud"));
        root.addNode(new Node<>(40, "Genlad våben"));
        root.printTree();

        getNewAction();

    }

    public static void getNewAction() {
            System.out.println("What do you want to do?");
            System.out.println("1 : Add new node");
            System.out.println("2 : Search for highest value with Post-Order");
            System.out.println("3 : Search for highest value with Reverse In-Order");
            System.out.println("4 : Quit");
            int action = Utils.reader(1, 3);

            switch (action) {
                case 1:
                    addNewNode();
                    printTree();
                    getNewAction();
                    break;
                case 2:
                    getNodePO(getBestNodeRIO(false).value);
                    getNewAction();
                    break;
                case 3:
                    getBestNodeRIO(true);
                    getNewAction();
                    break;
                case 4:
            }
    }
    public static void addNewNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node name:");
        String name = sc.nextLine();
        System.out.println("Enter node value:");
        Integer value = Integer.valueOf(sc.nextLine());
        root.addNode(new Node<>(value, name));
    }

    public static void printTree() {
        root.printTree();
    }

    public static Node<Integer> getBestNodeRIO(boolean print) {
        Node<Integer> currentNode = root;
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        if(print){
        System.out.println(currentNode.value + ": " + currentNode.name);
        }
        return currentNode;
    }

    public static void getNodePO(Integer value) {
        Node<Integer> bestNode = root.getNodeFromValuePO(value);
        System.out.println(bestNode.value + ": " + bestNode.name);
    }
}
