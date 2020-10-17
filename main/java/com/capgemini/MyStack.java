package com.capgemini;

public class MyStack {
	private final MyLinkedList myList;

	public MyStack() {
		this.myList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myList.add(myNode);
	}

	// create and add to the stack
	
	public INode peak() {
		return myList.head;
	}
	
	public void printStack() {
		myList.printMyNodes();
	}

}
