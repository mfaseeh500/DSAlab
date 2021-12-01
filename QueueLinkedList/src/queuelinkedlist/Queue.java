/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Queue {
    private Node head;
    public int max;
    public Queue(){
    this.head=null;
}
    public boolean isEmpty(){
        return (head==null);
    }
    public void enqueue(int item){
        if(isEmpty())
        {
            Node n=new Node();
            n.value=item;
            n.next=head;
           head=n; 
           return;
        }
        Node n=new Node();
        n.value=item;
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=n;
    }
    public int dequeue(){
        if(isEmpty())
        { 
            throw new IllegalStateException("Queue is Empty");
        }
        Node temp=head;
        head=head.next;
        return temp.value;
    
}
   
    public int peek(){
        return head.value; 
    }
    public void displayQueue(){
        Node currentNode=head;
        System.out.print("[");
        while(currentNode!=null){
            currentNode.displayNode();
            currentNode=currentNode.next;
        }
         System.out.print("]");
    }
       public boolean isComplete(){
            return (head.next!=null);
            
        }
    public int maxValue(){
        Node temp=head;
        max=head.value;
        
        
       
            if(max<=head.next.value)
            {
              
        head.next=head;
        return temp.value;
            }
           
        
        return max;
    }
        
        
    
}