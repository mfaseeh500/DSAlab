/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;
import java.util.Scanner;


/**
 *
 * @author MUHAMMAD FASEEH
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Doubly dll=new Doubly();
        dll.insertAtFirst(input.nextInt());
 dll.insertAtFirst(input.nextInt());
  dll.insertAtFirst(input.nextInt());
   dll.insertAtFirst(input.nextInt());
   dll.print();
    }
    
}
