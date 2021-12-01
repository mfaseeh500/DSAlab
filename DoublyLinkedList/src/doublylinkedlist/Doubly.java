/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Doubly {
  
private Node First; //  Also Called Head  or Front
private Node Last;  // Also Called Tail  or Rear

      Doubly(){
      First = null;
      Last = null;
      }

      public boolean isEmpty(){
       return First == null;
      }
      
      public void insertAtFirst(int item){
      Node n = new Node();
      n.value = item;
      n.next = First;
      n.prev = Last;
      if(isEmpty()){
       Last = n;
      }else{
       n.next = First;
       First.prev = n; 
      }
      First = n;
      }

      public void insertAtLast(int item){
        Node n = new Node();
        n.value = item;
        n.next = null;
        if(isEmpty()){
          First = n;
        }else{
          Last.next = n;
          n.prev = Last;
        }
         Last = n;
      }
         
      public int DeleteFirstNode(){
       Node p = First;
        if(isEmpty()){
          System.out.println("List Is Empty");
          return -1;
        }else if(p.next == null){
        First = null; 
        } else{
        First = p.next;
        First.prev = null;
        } 
      return p.value;
      }
      
      public int DeleteLastNode(){
        if(isEmpty()){
        System.out.println("List is Empty");
            return -1;
        }
         Node p = Last;
         Last = Last.prev;
         Last.next = null;
          return p.value;
      }
      
      public void print(){
        if(isEmpty()){
        System.out.println("List is Empty");
        }else{
           Node p = First;
          while(p != null){
             System.out.print(" {"+p.value+"} --> ");     
             p = p.next;
          }
        }
      }

//node
    class Node
    {
        private int value;
        private Node next;
        private Node prev;
    }    
    
    
}

