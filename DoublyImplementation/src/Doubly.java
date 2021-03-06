public class Doubly {

    public Node First; //  Also Called Head  or Front
    public Node Last;  // Also Called Tail  or Rear

    Doubly(){
        First = null;
        Last = null;
    }

    public boolean isEmpty(){
        return First == null;
    }

    public void insertAtFirst(int item){
        Node n = new Node();
        n.value = item;
        n.prev = Last;
        if(isEmpty()){
            Last = n;
        }else{
            n.next = First;
            First.prev = n;
        }
        First = n;
    }

    public void insertAtLast(int item){
        Node n = new Node();
        n.value = item;
        n.next = null;
        if(isEmpty()){
            First = n;
        }else{
            n.prev = Last;
            Last.next = n;

        }
        Last = n;
    }

    public int DeleteFirstNode(){
        Node p = First;
        if(isEmpty()){
            System.out.println("List Is Empty");
            return -1;
        }else if(p.next == null){
            First = null;
        } else{
            First = p.next;
            First.prev = null;
        }
        return p.value;
    }

    public int DeleteLastNode(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return -1;
        }
        Node p = Last;
        Last = Last.prev;
        Last.next = null;
        return p.value;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            Node p = First;
            while(p != null){
                System.out.print(" {"+p.value+"} --> ");
                p = p.next;
            }
        }
    }

    public int Max(){

        Node p = First;
        int temp = First.value;
        while(p != null){
            if(p.value > temp){
                temp = p.value;
            }
            p = p.next;
        }

        return temp;
    }

    public int Min(){

        Node p = First;
        int temp = First.value;
        while(p != null){
            if(p.value < temp){
                temp = p.value;
            }
            p = p.next;
        }

        return temp;
    }


    public int Product(){
int product=1;
        Node p = First;

        while(p!= null){
            product = product * p.value;
            p = p.next;}

        return product;
    }

    public float average(){
        float totalSum = 0;
        float Count =0;
        float average = 0;

        Node p = First;

        while(p != null){
            totalSum = totalSum + p.value;
            p = p.next;
            Count++;
        }

        average = totalSum / Count;
        return average;
    }


    public void Even(){


        Node p = First;

        while(p != null){
            if(p.value%2 == 0){
                System.out.println(p.value);
            }
            p = p.next;

        }

    }
    public void Odd(){


        Node p = First;

        while(p != null){
            if(p.value%2 != 0){
                System.out.println(p.value);
            }
            p = p.next;

        }

    }}




