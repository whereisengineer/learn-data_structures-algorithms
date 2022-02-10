package tree;

public class PreorderTraversal {

    public static void main(String[] args) {
        Node root = CreateTree.treeCreation();

        printPreOrder(root);
    }

    public static void printPreOrder(Node root){

        if(root == null){
            return;
        }

        System.out.println(root.key);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
