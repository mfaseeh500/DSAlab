/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.array;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Queue {
    
  private int[] arr;
  private int maxSize;
private int Count;
private int rear ;  //Also Known as tail 
private int front;  //Also Know as head
    

    Queue(int size){
    this.maxSize = size;
    this.arr = new int [size];
    this.Count  = 0;
    this.rear = -1;
    this.front = -1;
    }
    public void enqueue(int item){
    if(isEmpty()){
    front++;
    }else if(Count == maxSize){
    System.out.println("Que is Full");
    }
    rear++;
    arr[rear] = item;
    Count++;
    
    }
    public int dequeue(){
      if(isEmpty()){
          System.out.println("Que is Empty");
          return -1;
      }else{
     int val =  arr[front];
      front++;
      Count--;
      return val;
      }
    }
    public boolean isEmpty(){
    return rear == -1;
    }
    public int peek(){
    return arr[front];
    }
    public boolean isComplete(){
    return maxSize == front;
    }
    public void print(){
    while(!isComplete()){
    System.out.println(dequeue());
    }
    }
}