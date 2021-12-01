/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Stack {
  
    private int top;
    private int maxSize;
    private int[] arr;
    
    Stack(int size){
    this.maxSize = size;
    this.arr = new int[maxSize];
    this.top = -1;
    }
    public boolean isEmpty(){
    return top == -1;
    }
    public boolean isFull(){
    return top ==  maxSize -1;
    }
    public void push(int item){
        if(isFull()){
         throw new IllegalStateException("Stack is full Cannot Delete");
        }
     top = top + 1;
     arr[top] = item;
    }
    public int pop(){
        if(isEmpty()){
        throw new IllegalStateException("Stack is Empty Cannot Delete");
        }
     int temp = arr[top];
    top --;
    return temp;
    }
    public void print(){
        while(!isEmpty()){
         System.out.println(pop());
        }
    }
    public int peek(){
    return top;
    }
    public void reverse(){
        for(int i=top-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

