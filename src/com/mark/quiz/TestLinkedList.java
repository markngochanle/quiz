package com.mark.quiz;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList myLinkedlist = new LinkedList();
		System.out.println("Let start");
		myLinkedlist.printLinkedList();
		
		System.out.println("Add into first node");
		myLinkedlist.addFirst(5);
		myLinkedlist.printLinkedList();
		
		System.out.println("Add into first node");
		myLinkedlist.addFirst(6);
		myLinkedlist.printLinkedList();
		
		System.out.println("Add into first node");
		myLinkedlist.addFirst(7);
		myLinkedlist.printLinkedList();
		
		System.out.println("Add into first node");
		myLinkedlist.addFirst(1);
		myLinkedlist.printLinkedList();
		
		System.out.println("Add into last node");
		myLinkedlist.addLast(2);
		myLinkedlist.printLinkedList();
		
		System.out.println("remove last node");
		myLinkedlist.removeLast();
		myLinkedlist.printLinkedList();
		
		System.out.println("remove node with data > 5");
		myLinkedlist.removeWithCondition(5);
		myLinkedlist.printLinkedList();
	}
}
