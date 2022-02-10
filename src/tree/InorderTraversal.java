package tree;

public class InorderTraversal {

    public static void main(String[] args) {
        Node root = CreateTree.treeCreation();

        printInorder(root);
    }
    public static void printInorder(Node root){

        if(root == null){
            return;
        }

        printInorder(root.left);
        System.out.println(root.key);
        printInorder(root.right);
    }
}
