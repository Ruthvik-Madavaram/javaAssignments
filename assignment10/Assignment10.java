class Node<T>{
    T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
	}
}

class SList<T>{
	Node<T> head;
	SList(){
		head = null;
	}
	
	public Node<T> getHead() {
        return head;
    }
	
	public void setHead(Node<T> head){
	        this.head=head;
	}
	
	public String toString() {
        Node<T> temp = head;
        String nodes = "";
        while(temp!=null) {
            nodes += temp.data +" ";
            temp = temp.next;
        }
        return nodes;
    }
	
	public SListIterator<T> iterator() {
        return new SListIterator<T>(this);
    }
	
}

class SListIterator<T> {
	SList<T> ll;
    Node<T> head;

    public SListIterator(SList<T> list) {
        ll = list;
        head = ll.getHead();
    }
    
    public void insert(T data) {
        Node<T> temp =new Node<T>(data);
        Node<T> curr = head;

        if (head == null) {
            head = temp;
            //System.out.println(head.data);
        }
        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
        ll.setHead(head);
    }

    public void remove(int pos) {
        Node<T> prev = null;
        Node<T> curr = head;

        if(pos == 1){
            head = head.next;
        }
        else {
            for (int i = 0; i < pos - 1; i++) {
                prev = curr;
                curr= curr.next;
            }
            prev.next = curr.next;
        }
        ll.setHead(head);
    }
}

public class Assignment10 {

	public static void main(String[] args) {
		SList<Integer> list=new SList<Integer>();
        SListIterator<Integer> itr =list.iterator();

        itr.insert(1);
        itr.insert(2);
        itr.insert(3);
        itr.remove(2);
        itr.insert(5);
        itr.insert(6);
        itr.remove(5);
        itr.insert(8);
        itr.insert(9);
        itr.insert(10);
        
        System.out.println("List : "+list);

	}

}
