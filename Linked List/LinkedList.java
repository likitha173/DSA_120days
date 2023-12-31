public class LinkedList {
    public static class  Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }  
    public static Node head;  
    public static Node tail;  
    public static int size;  

    //Methods

    public void addFirst(int data){  //O(1)
        //  step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 = newNode next = head
        newNode.next = head;

        // step3 - head = newNode
        head = newNode;
    }

////////////////////////////////////////////////////////

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //////////////////////////////////////////////////////// 

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    ////////////////////////////////////////////////////////

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    ////////////////////////////////////////////////////////

    public int removeLast(){
        if(size == 0){
            System.err.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    ////////////////////////////////////////////////////////

    public int itrSearch(int key){ //O(n)
        int i = 0;
        Node temp = head;

        while (temp != null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

////////////////////////////////////////////////////////

    public int helper(Node head, int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

////////////////////////////////////////////////////////

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

////////////////////////////////////////////////////////

    public void deleteNthfromEnd(int n){
        // size 
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int iTofind = sz-n;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
////////////////////////////////////////////////////////
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.add(2, 9);
        
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(19));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(19));

        ll.deleteNthfromEnd(3);
        ll.print();

        ll.reverse();
        ll.print();
        
    }
}
