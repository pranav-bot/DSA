

public class linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public linkedlist(){
        this.size=0;       
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val; 
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node seccondLast = get(size-2);
        int val = tail.value;
        tail = seccondLast;
        tail.next=null;
        return val;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        return val;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }



    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}