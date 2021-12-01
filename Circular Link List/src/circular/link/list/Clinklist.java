/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.link.list;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Clinklist {
 private Node Head;
 private Node Last;
 
 Clinklist(){
 Head = null;
 Last = null;
 }
 public boolean isEmpty(){
 return Head == null;
 }
 public void insertAtFirst(int item){
    Node n = new Node();
      n.value = item;
   if(isEmpty()){
   Last =  n;
   }   
    n.next =  Head;
    Head = n;
 }
 public void insertAtLast(int item){
    Node p = Head ;
    while(p.next != null){
     p = p.next;
    }
    Node n = new Node();
    n.value = item;
    n.next =  null;
    Last.next = n;
    Last = n;
 }
 public int First (){
 return Head.value;
 }
 public int Last(){
 return Last.value;
 }
 public void print(){
     Node p = Head;
     while(p != null){
     System.out.println(p.value);
     p = p.next;
     }
 
 }   
 public void DeleteAtFirst(){
 Head = Head.next;
 }   
 public void DeleteAtLast(){
  Node p = Head;
  Node temp = null ;
while(p.next !=  null){
temp = p;
p = p.next;
}  
temp.next = null;
Last = temp;
 }
  class Node{
   private int value;
   private Node next;
   }  
}