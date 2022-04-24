public class BinaryTree_Array {
    Node root;
    class Node{
        int data;
        Node right, left;
        Node (int data) {
            this.data = data;
        }
    }
    public Node arrayTree(int []arr, Node root, int i){

        if (i <arr.length){
            Node newNode = new Node(arr[i]);
            root = newNode;
            root.left = arrayTree(arr, root.left, 2*i+1);
            root.right =arrayTree(arr, root.right, 2*i+2);
        }
        return root;
    }
    public void display(Node root){
        if (root !=null){
            System.out.print(root.data +" ");
            display(root.left);
            display(root.right);
        }
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 4, 6, 5, 3, 8, 7};
        BinaryTree_Array obj = new BinaryTree_Array();
        obj.root =obj.arrayTree(arr, obj.root, 0);
        obj.display(obj.root);
    }
}
