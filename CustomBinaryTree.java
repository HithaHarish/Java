import java.util.*;
class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree();
    }
}

class BinaryTree
{
    private static class Node{
        int value;
        Node left;
        Node right;
        
        private Node(int value){
            this.value = value;
        }
    }
    
    private Node root;
    Scanner scanner = new Scanner(System.in);
    
    public void createTree(){
        System.out.println("Enter the root value: ");
        int val = scanner.nextInt();
        root = new Node(val);
        insert(root);
    }
    
    public void insert(Node node){
        System.out.println("Does Left Exist?: true/false");
        boolean Bleft = scanner.nextBoolean();
        if(Bleft){
            System.out.println("Enter the value: ");
            int val = scanner.nextInt();
            Node left = new Node(val);
            insert(left);
        }
        System.out.println("Does Right Exist?: true/false");
        boolean Bright = scanner.nextBoolean();
        if(Bright){
            System.out.println("Enter the value: ");
            int val = scanner.nextInt();
            Node right = new Node(val);
            insert(right);
        }
    }
}
