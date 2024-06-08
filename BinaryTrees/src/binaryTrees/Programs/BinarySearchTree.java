package binaryTrees.Programs;

class Node{
    int data;
    Node left,right;
    Node(int data){
        left=right=null;
        this.data=data;
    }
}

class BST{
    Node root;
    BST (){
        root = null;
    }
  public void add (int data){
        root = addRecursive(root,data);
  }

    private Node addRecursive(Node current, int data) {
        if (current ==null){
            return new Node(data);
        }
        else if(data<current.data){
            current.left=addRecursive(current.left,data);
        }
        else if(data>current.data){
            current.right=addRecursive(current.right, data);
        }else{
            return current;
        }

        return current;
    }

    public void inOrderdisplay(Node root){
        if(root!=null){
            inOrderdisplay(root.left);
            System.out.println(root.data+" ");
            inOrderdisplay(root.right);
        }
    }

    public void PreOrderdisplay(Node root){
        if(root!=null){
            System.out.println(root.data+" ");
            inOrderdisplay(root.left);

            inOrderdisplay(root.right);
        }
    }

    public void PostOrderdisplay(Node root){
        if(root!=null){

            inOrderdisplay(root.left);

            inOrderdisplay(root.right);
            System.out.println(root.data+" ");
        }
    }

}

public class BinarySearchTree {

    public static void main(String[] args) {
        BST obj = new BST();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        System.out.println("In order display!!");
        obj.inOrderdisplay(obj.root);

        System.out.println("PreOrder display!!");
        obj.PreOrderdisplay(obj.root);

        System.out.println("PostOrder display!!");
        obj.PostOrderdisplay(obj.root);

    }

}
