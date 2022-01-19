public class Tree {
    public class Node {
        int value;
        Node leftchild;
        Node rightchild;
        public Node(int value) {
            this.value = value;
        }
        @Override
            public String toString(){
            return "Node +"+value;
}
    }
    public Node Root; //declaring root node
    public void insert(int value){
        if(Root==null){
            Root=new Node(value);
            return;
        }
        Node current=Root;
        while(true){
            if(value<current.value){
                if(current.leftchild==null){
                    current.leftchild=new Node(value);
                    break;
                }current=current.leftchild;
            }
            else
            {
             if(current.rightchild==null){
                 current.rightchild=new Node(value);
                 break;
             }
             current=current.rightchild;
            }
        }
    }//insert function end
    public boolean Find(int value) {
        Node current = Root;
        while (current != null) {
            if (value < current.value)
                current = current.leftchild;
            else if (value > current.value)
                current = current.rightchild;
            else
                return true;

        }
        return false;
    } //end of Find Function

    public void traversePreOrder(){
         traversePreOrder(Root);

    }
    public void traversePreOrder(Node Root){
     if(Root==null)
         return;
        System.out.print(Root.value+",");
        traversePreOrder(Root.leftchild);
        traversePreOrder(Root.rightchild);
    }
    public void traverseInOrder(){
        traverseInOrder(Root);

    }
    public void traverseInOrder(Node Root){
        if(Root==null)
            return;
        traverseInOrder(Root.leftchild);
        System.out.println(Root.value);

        traverseInOrder(Root.rightchild);
    }
    public void traversePostOrder(){
        traversePostOrder(Root);

    }
    public void traversePostOrder(Node Root){
        if(Root==null)
            return;
        System.out.print(Root.value);
        traversePostOrder(Root.leftchild);
        traversePostOrder(Root.rightchild);
    }
    public int height(){//Q3
        return height(Root);
    }
    private int height(Node Root){
        if(Root == null){
            return -1;
        }
        else if(Root.leftchild==null && Root.rightchild==null){
            return 0;
        }
        else{
            return 1+Math.max(height(Root.leftchild), height(Root.rightchild));
        }
    }
    public int MaxNode(){//Q5
        return MaxNode(Root);
    }
    private int MaxNode(Node Root){
        if(Root == null){
            throw new IllegalArgumentException("BST Empty.");
        }
        Node current=Root;
        Node Parent=current;
        while(current!=null){
            Parent=current;
            current=current.rightchild;
        }
        return Parent.value;
    }

    public int MinNode(){//Q5
        return MinNode(Root);
    }
    private int MinNode(Node Root){
        if(Root == null){
            throw new IllegalArgumentException("BST Empty.");
        }
        Node current=Root;
        Node Parent=current;
        while(current!=null){
            Parent=current;
            current=current.leftchild;
        }
        return Parent.value;
    }
    public boolean equal(Tree other){
        if(other == null){
            return false;
        }
        return equals(Root, other.Root);
    }
    private boolean equals(Node first, Node second){
        if(first == null && second == null){
            return true;
        }
        //using preorder traversal
        if(first != null && second != null){
            return first.value == second.value &&
                    equals(first.leftchild, second.leftchild)&&
                    equals(first.rightchild, second.rightchild);
        }
        return false;
    }
}//tree ending


