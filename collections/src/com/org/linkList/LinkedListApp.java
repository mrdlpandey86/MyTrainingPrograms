package com.org.linkList;

public class LinkedListApp {
	private static Node<Integer> head;
	private static Node<Integer> last;

	public static void main(String[] args) {
		head = new Node<>(10);
		last = head;
		System.out.println("Created a linked list with start value " + head.getData());
		addNode(20);
		addNode(30);
		addNode(40);
		addNode(50);
		addNode(60);
		print();

		deleteNode(30);
		print();
	}

	public static void addNode(int value) {
		Node<Integer> newNode = new Node<>(value);
		last.setNext(newNode);
		last = newNode;
		System.out.println("Added a new node with value " + value);
	}

	public static void deleteNode(int value) {
		Node<Integer> current = head;
		Node<Integer> previous = head;
		while (current != null && previous != null) {
			if (current.getData() == value) {
				if (current == previous) {
					head = current.getNext();
					current.setNext(null);
					System.out.println("Deleted node with value " + value);
				} else {
					previous.setNext(current.getNext());
					current.setNext(null);
					System.out.println("Deleted node with value " + value);
				}
				break;
			}
			previous = current;
			current = current.getNext();
		}
	}

	public static void print() {
		if (head != null) {
			System.out.println("\nPrinting linked list");
			Node<Integer> start = head;
			System.out.print(start.getData() + " ");
			while (start.getNext() != null) {
				start = start.getNext();
				System.out.print(start.getData() + " ");
			}
			System.out.println("\n");
		}
	}

}

class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
