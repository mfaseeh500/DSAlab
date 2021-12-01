/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.practice;

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class ArrayDynamic {
     private int[] arr;
    private int maxSize;
    private int Count = -1;

    ArrayDynamic(int size){
        arr = new int[size];
        maxSize = size;
    }
    public boolean isEmpty(){
        return  Count == -1;
    }
    public boolean isFull(){
        return  Count ==  maxSize -1;
    }
    public void insert(int item){
        if(isFull()){
            int[] newArray = new int[maxSize * 2];
            for(int i = 0 ; i <= Count ; i++){
                newArray[i] = arr[i+1];
            }
            arr =  newArray;
            maxSize = maxSize * 2 ;
            Count++;
            arr[Count] = item;
        }else{
            Count++;
            arr[Count] = item;
        }
    }
    public void print() {
        for(int i =0 ; i<= Count ; i++){
            System.out.println(arr[i]);
        }


    }
    public int Size(){
        return maxSize;
    }
    public int ElementCount(){
        return Count + 1 ;  // O(1)
    }
    public void removeAt(int index){
        if(isEmpty()){
            System.out.println("Empty Hai");
        }else{
            if(index < 0 || index > Count){
                System.out.println("Wrong Index");
            }else{
                for (int i = index ; i < Count ; i++ ){
                    arr[i] = arr[i + 1];
                }
                Count--;
            }

        }

    }
    public int indexOf(int item){
        for(int i = 0 ; i <= Count ; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
}
