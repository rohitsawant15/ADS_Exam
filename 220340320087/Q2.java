//Q2: Reverse a Linked List
class Q2{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node (int r){
			this.data=r;
			this.next=null;
		}
	}
	Node reversed(Node n){
		Node prev=null;
		Node current = n;
		Node next= null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		n=prev;
		return n;
	}
	
	void printL(Node n){
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
			
		}System.out.print("NULL");
		
	}
	
	public static void main(String[] args){
		Q2 r = new Q2();
		r.head= new Node(84);
		r.head.next= new Node(14);
		r.head.next.next=new Node(5);
		r.head.next.next.next= new Node(22);
		r.head.next.next.next.next = new Node(34);
		System.out.println("Linked List given: ");
		r.printL(head);
		head = r.reversed(head);
		System.out.println();
		System.out.println("Reversed Linked List: ");
		r.printL(head);
		
	}	
}