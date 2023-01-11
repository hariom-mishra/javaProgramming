class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
class LinkedListDemo{
	static void traverse(Node head){
		System.out.println("");
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	static void insertAtposition(int data, Node head, int pos){
		Node toAdd = new Node(data);
		if(pos ==0){
			toAdd.next = head;
			head = toAdd; return;
		}
		Node prev = head;
		for(int i=0;i<pos-1;i++){
			prev= prev.next;
		}
		toAdd.next = prev.next;
		prev.next = toAdd;
	}		
	static void deletePosition(Node head, int pos){
		if(pos== 0){
			head = head.next;
			return;
		}
		Node prev = head;
		for(int i = 0;i<pos-1;i++){
			prev = prev.next;
		}
		prev.next = prev.next.next;
	}
	public static void main(String args[]){

		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);
		Node head = n1;
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		traverse(head);
		insertAtposition(45,head,2);
		traverse(head);
		deletePosition(head, 3);
		traverse(head);


		
	}
}