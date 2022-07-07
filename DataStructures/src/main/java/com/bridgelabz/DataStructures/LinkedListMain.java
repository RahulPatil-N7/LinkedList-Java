package com.bridgelabz.DataStructures;

/* create a simple Linked List
* of 56, 30 and 70 */
public class LinkedListMain {

	public static void main(String[] args) {
		
		System.out.println("Lets Create Linked List !\n");
		
		LinkedList list = new LinkedList();
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		
		//using list object of LinkedList to call node operations
		list.addNode(firstNode);
		list.addNode(secondNode);
		list.addNode(thirdNode);
		list.display(firstNode);
		System.out.println("\nAfter Deleting the first element.");
		list.pop();         //deleting first node of linked list
		list.display(secondNode);
	}

}
