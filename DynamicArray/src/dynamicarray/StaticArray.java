/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicarray;
//isme space barhate hai

import java.util.Scanner;
/**
 *
 * @author MUHAMMAD FASEEH
 */
///name is wrongly written this is dynamic array as the size can be increased when needed
public class StaticArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Array as=new Array(3);
        System.out.println("enter"+ " "+ as.Size()+" "+ "Values");
          
        as.insert(3);
        as.insert(2);
        as.insert(4);
        as.insert(6);
        as.removeAt(1);
        
           System.out.println("result");
           as.print();
    }
    
}
