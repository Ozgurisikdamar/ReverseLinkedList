package reverseLL;

public class LinkedListReversal {
		 private Node head;
		 LinkedListReversal(){
		  head = null;
		 }
		 static class Node{
		  //data
		  int i;
		  Node next;
		  Node(int i){
		   this.i = i;
		   this.next = null;
		  }
		  public void displayData(){
		   System.out.print(" " + i);
		  }
		 }
		 // Method to add nodes to linked list
		 public void insertLast(Node newNode){
		  if(isEmpty()){
		   head = newNode;
		  }else{
		   Node current = head;
		   // traverse to the last of the list
		   while(current.next != null){
		    current = current.next;
		   }
		   // adding new node, current last node
		   // starts referencing to this new node
		   current.next = newNode;
		  }
		 }
		 public boolean isEmpty(){
		  return head == null;
		 }
		 //Method for reversing linked list
		 public void reverseList(){
		  Node previous = null;
		  Node current = head;
		  Node next;
		  while(current != null){
		   next = current.next;
		   // that’s where reference is reversed
		   current.next = previous; 
		   // Move forward by one node
		   previous = current;
		   current = next;
		  }
		  // By the end of traversal previous is at the 
		  // last node which becomes the head after reversal
		  head = previous;
		 }
		 // Method to traverse and display all nodes
		 public void displayList(){
		  Node current = head;
		  while(current != null){
		   current.displayData();
		   current = current.next;
		  }
		 }
		 public static void main(String[] args) {
		  LinkedListReversal list = new LinkedListReversal();
		  list.insertLast(new Node(10));
		  list.insertLast(new Node(20));
		  list.insertLast(new Node(30));
		  list.insertLast(new Node(40));
		  list.insertLast(new Node(50));
		  System.out.println("Original linked list");
		  list.displayList();
		  list.reverseList();
		  System.out.println("");
		  System.out.println("Reversed linked list");
		  list.displayList();
	}
}
