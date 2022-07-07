package com.bridgelabz.DataStructures;

/* create a simple Linked List
* of 56, 30 and 70 */
public class LinkedListMain {

	public static void main(String[] args) {
		
		System.out.println("Lets Create Linked List to add 56,30 & 70!\n");
		
		LinkedList list = new LinkedList();
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		
		//Using list object of LinkeList to call Node operations
		list.addNode(firstNode);
		list.addNode(secondNode);
		list.addNode(thirdNode);
		list.display(firstNode);
	}

}
