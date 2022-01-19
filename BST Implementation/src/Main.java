import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Tree t=new Tree();
        System.out.println("Enter number of nodes in your binary tree ");
        int length=Integer.parseInt(s.nextLine());
        for(int i=0;i<length;i++) {
            System.out.println("Enter Values ");
            int x = Integer.parseInt(s.nextLine());

            t.insert(x);
            //t.insert(7);
            //t.insert(8);
            //t.insert(6);
            //t.insert(10);}
        }

        System.out.println("1)Find Node");
        System.out.println("1)Find Height");
        System.out.println("1)Find Max Node");
        int b=Integer.parseInt(s.nextLine());
        if (b==1){
            System.out.println("Enter the Value you want to find = ");
            int a=Integer.parseInt(s.nextLine());
            System.out.println(t.Find(11));
        }
       // System.out.println("Done");
       // System.out.println(t.Find(11));
        //System.out.println(t.height());
        //System.out.println(t.MaxNode());
        //System.out.println(t.MinNode());
        //t.traversePreOrder();
    }
}
