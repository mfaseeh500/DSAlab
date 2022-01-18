

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Tree {//tree start
    
    private class Node{//starting
        private final int value;     //for charater change the data type and do changes in code->can come in exam
        private Node leftChild;
        private Node rightChild;
        
        public Node(int value){
            this.value=value;
        }
        
        //press alt+insert
        @Override
        public String toString() {
            return "Node = "+value;
        }
        
    }//Ending
    
    private Node root;
    public void insertNode(int value){
        if(root == null){
            root = new Node(value);
            return; //exit from function
        }
        Node current = root; //start ptr from root/head
        while(true){
            if(value <= current.value){
                if(current.leftChild == null){
                    current.leftChild=new Node(value);
                    break;
                }
                current=current.leftChild;//traverse
            }
            else{
                if(current.rightChild == null){
                    current.rightChild = new Node(value);
                    break;
                }
                current=current.rightChild;//traverse
            }
        }
    }
    
    public boolean FindNode(int value){
        Node current = root;//ptr starting from root/head node
        while(current != null){
            if(value< current.value){
                current = current.leftChild;
            }
            else if(value > current.value){
                current = current.rightChild;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
    //root,left,right
    public void TraversePreOrder(){
        traversePreOrder(root);
        System.out.println(" ");
    }
    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+"->");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    
    //left,root,right
    public void TraverseInOrder(){
        System.out.println("Ascending");
        traverseInOrder(root);
        System.out.println(" ");
        System.out.println("Decending");
        traverseInorderDE(root);
        System.out.println(" ");
    }
    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.print(root.value+"->");
        traverseInOrder(root.rightChild);
    }
    private void traverseInorderDE(Node root){//right,root,left
        if(root == null){
            return;
        }
        traverseInorderDE(root.rightChild);
        System.out.print(root.value+"->");
        traverseInorderDE(root.leftChild);
    }
    
    //left, right,root
    public void TraversePostOrder(){
        traversePostOrder(root);
        System.out.println(" ");
    }
    private void traversePostOrder(Node root){
        if(root==null){
            return;
        }
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value+"->");
    }
    
    //tree height
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root == null){
            return -1;
        }
        else if(root.leftChild == null && root.rightChild==null){
            return 0;
        }
        return 1+Math.max(height(root.leftChild), height(root.rightChild));
    }
    
    public int min(){
        return minNode(root);
    }
    private int minNode(Node root){
        if(root == null){
            throw new IllegalStateException("BST is Empty");
        }
        Node current = root;
        Node last = current;
        while(current !=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
    }
    
    public int max(){
        return maxNode(root);
    }
    private int maxNode(Node root){
        if(root == null){
            throw new IllegalStateException("BST is Empty");
        }
        Node current = root;
        Node last = current;
        while(current !=null){
            last=current;
            current=current.rightChild;
        }
        return last.value;
    }
    
    
    public boolean equal(Tree other){
        if(other == null){
            return false;
        }
        return equals(root, other.root);
    }
    private boolean equals(Node first, Node second){
        if(first == null && second == null){
            return true;
        }
        //using preorder traversal
        if(first != null && second != null){
            return first.value == second.value && 
                    equals(first.leftChild, second.leftChild)&&
                    equals(first.rightChild, second.rightChild);
        }
        return false;
    }
}//tree ending
