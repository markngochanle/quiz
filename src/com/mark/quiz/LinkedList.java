package com.mark.quiz;

class Node {
	public int data;
	public Node next;

	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}

public class LinkedList {
	private Node head;

	// used add a first node
	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	// used add a last node
	public void addLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	// used remove a last node
	public Node removeLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return temp;
	}

	// used remove the node that greater than a target value
	public Node removeWithCondition(int data) {
		Node iter = head;

		while (iter.next != null) {
			if (iter.next.data <= data) {
				return iter;
			}

			iter.next = iter.next.next;
		}
		return null;
	}

	// For printing Linked List
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
}