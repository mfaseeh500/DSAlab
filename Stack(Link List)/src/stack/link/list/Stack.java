/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.link.list;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Stack {
   
  private  Node top;
   
    Stack(){
    top = null;
    }
    public void push(int item){
      Node n = new Node();
      n.Data = item;
      n.next = top;
      top = n; 
    } 
    public void pop(){
      if(isEmpty()){
       System.out.println("Stack is Empty");    
      }else{
         top = top.next;
      }
    }
    public void print(){
      if(isEmpty()){
      System.out.println("Empty Stack");
      }else{
         Node p = top;
         while (p  !=  null){
          System.out.println(p.Data);
          p = p.next;
         }
      }
    }
    public boolean isEmpty(){
    return top == null;
    }
    
    
    
    
    
    
    
    class Node {
      private int Data;
     private Node next;
}
}

