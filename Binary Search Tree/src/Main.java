/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
        Tree tree = new Tree();
        tree.insertNode(7);//root node
        tree.insertNode(4);//leftchild
        tree.insertNode(9);//rightchild
        tree.insertNode(1);
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(10);
        System.out.println("Done");
        System.out.println(tree.FindNode(10));
        System.out.println(tree.FindNode(2));
        
        System.out.println("PreOrder:");//root,left,right
        tree.TraversePreOrder();
        System.out.println("Inorder");//left,root,right
        tree.TraverseInOrder();
        System.out.println("PostOrder");//left, right,root
        tree.TraversePostOrder();
        System.out.println("Height of the tree:"+tree.height());
        System.out.println("Min:"+tree.min());
        System.out.println("Max:"+tree.max());
        
        Tree tree2 = new Tree();
        tree2.insertNode(7);//root node
        tree2.insertNode(4);//leftchild
        tree2.insertNode(9);//rightchild
        tree2.insertNode(1);
        tree2.insertNode(6);
        tree2.insertNode(8);
        tree2.insertNode(10);
        //if any node is different the answer will be false
        System.out.println(tree.equal(tree2));
    }
}
