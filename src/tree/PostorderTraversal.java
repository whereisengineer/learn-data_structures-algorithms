package tree;

public class PostorderTraversal {

    public static void main(String[] args) {
        Node root = CreateTree.treeCreation();

        printPostorder(root);
    }

    public static void printPostorder(Node root){
        if(root == null){
            return;
        }

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.println(root.key);
    }
}
