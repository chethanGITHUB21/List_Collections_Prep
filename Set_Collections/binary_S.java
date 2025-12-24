
import java.util.*;
public class binary_S {

    static Boolean search(Node root, int key){

        if(root == null)
            return false;

        root.status = NodeStatus.VISITED;
        System.out.println("Visiting node with data: "+root.data);

        if(root.data == key)
            return true;

        if(key > root.data)
            return search(root.right, key);

        return search(root.left, key);

        
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(30);        
        root.right.left = new Node(9);        
        root.right.right = new Node(60);

        // Creating BST
        //     10
        //    / \
        //   4   30
        //  / \   / \
        // 2  5  9  60

        Scanner sc = new Scanner(System.in);
        System.out.println("enter which element you want to search in the tree: ");
        int key = sc.nextInt();

        System.out.println(search(root, key));
    }
    
}
enum NodeStatus{
    VISITED, UNVISITED;
}

class Node{
    int data;
    Node left, right;
    NodeStatus status;

    public Node(int item){
        data = item;
        left = right = null;
        this.status = NodeStatus.UNVISITED;
        
    }
}