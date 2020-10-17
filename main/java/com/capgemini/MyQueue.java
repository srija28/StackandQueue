package com.capgemini;

public class MyQueue {
	private final MyLinkedList myList;

	public MyQueue() {
		myList = new MyLinkedList();
	}

	public void enQueue(INode newNode) {
		myList.append(newNode);
	}

	public int size() {
		return myList.size();
	}

	public boolean isEmpty() {
		if (myList.size() == 0)
			return true;
		else
			return false;
	}

	public void printQueue() {
		myList.printMyNodes();
	}

}
