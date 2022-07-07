package com.bridgelabz.DataStructures;

public class LinkedList {
	
	Node head ;
	Node tail ;
	int size ;
	
	//method to add node to linked list
	public void addNode(Node newNode) {
		if(head==null) {
			head = newNode ;
			tail = newNode ;
		}
		else {
			tail.next = newNode ;
			tail = newNode ;
		}
		size++;
	}
	
	//method to insert node in linked list 
	void insert(INode myNode,INode newNode) {
		INode temp = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);
	}
	
	//method to display linked list
	void display(INode head) {
		INode current = head ;
		if(head==null) {
			System.out.println("Linked List is empty.");
			
		}
		else {
			System.out.println("Nodes are :");
		}
		
		while(current!=null) {
			if (current.getNext()!=null) {
				System.out.println(current.getKey() + "--->");
				current = current.getNext();
			}
			else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}
			
		
	}

}