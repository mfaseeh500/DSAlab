import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Input Array Length : ");
        int Length = Integer.parseInt(myObj.nextLine());
        Doubly d = new Doubly();
        for (int i = 0; i < Length; i++) {
            System.out.print("\nenter Value : ");
            int x = Integer.parseInt(myObj.nextLine());
            d.insertAtFirst(x);
        }
        d.print();
        System.out.println("Value is present at position" + linearSearchI(d.First, 7));
        System.out.println("Product"+d.Product());
        System.out.println("Average"+d.average());
       d.Even();
        System.out.println("Minimum Value"+d.Min());


    }

    public static int linearSearchI(Node head, int value) {    //through iterative approach
        Node n = head;
        int position = 0;

        // Traverse the doubly linked list
        while (n.value != value && n.next != null) {
            // Update pos
            position++;

            // Update temp
            n = n.next;
        }

        // If the integer not present
        // in the doubly linked list
        if (n.value != value)
            return -1;
        // If the integer present in
        // the doubly linked list
        return (position + 1);
    }

   /* public static int linearSearchR

    {
        return
    }

    public static int linearSearchR(Node head, int value) {
        Node n = head;
        if (n.value != value && n.next != null)
            if (n.value != value)
                return -1;
            else {
                return 0;
                return 1 + linearSearchR(head, value);

            }

    }*/
}
