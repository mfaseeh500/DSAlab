/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author MUHAMMAD FASEEH
 */

    public class Singly {
    private Node Head;
    
    public void insertAtFirst(int item){
        Node n = new Node();
        n.value = item;
        n.next = Head;
        Head = n;
    }
    public void insertAtLast(int item){
       Node p = Head;  
       while( p.next != null){
        p = p.next;
       }
       Node n = new Node();
       n.value = item;
       n.next = null;
       p.next = n;

    }
    public void insertAtAnyPointBefore(int item , int after){
    if(Head == null){
    insertAtFirst(item);
    }else{
     Node p = Head;
     Node temp = null;
     while(p.value == after){
     p = p.next;
     }
     Node n = new Node();
     n.value = item;
     n.next = p.next;
     p.next = n;
    }
    
    
    }
   public void insertAtAnyPointAfter(int item , int after){
    if(Head == null){
    insertAtFirst(item);
    }else{
     Node p = Head;
     Node temp = null;
     while(p.next != null){
         if(p.value == after){
         temp = p;
         }
     p = p.next;
     }
     Node n = new Node();
     n.value = item;
     n.next = temp.next;
     temp.next = n;
    }
    
    
    }
    public void print(){
    Node p = Head;
    while(p != null){
      System.out.print("["+p.value+"]-->");
      p = p.next;
    }
    }
       
    
    
    class Node{
        private int value;
        private Node next;
     }
    
    
}

