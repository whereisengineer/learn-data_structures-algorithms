package tree;

class Node{
    Node left;
    Node right;
    int key;

    Node(int key){
        left = null;
        right= null;
        this.key = key;
    }

}

public class CreateTree {

    public static void main(String[] args) {
        Node root = treeCreation();

        printInOrder(root);
    }

    public static Node treeCreation(){

        //      Level 0
        Node root = new Node(10);

//      Level 1
        root.left = new Node(20);
        root.right = new Node(30);

//      Level 2
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        return root;
    }


    public static void printInOrder(Node root){

        if(root == null){
            return;
        }

        printInOrder(root.left);
        System.out.println(root.key);
        printInOrder(root.right);
    }
}
