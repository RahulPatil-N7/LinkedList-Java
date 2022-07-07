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
		
		//appending nodes 
		firstNode.setNext(secondNode);      //30 is appended to 56
		secondNode.setNext(thirdNode);      //70 is appended to 30
		list.display(firstNode);
	}

}
