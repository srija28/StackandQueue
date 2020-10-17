package com.capgemini;

import com.capgemini.*;
public class MyStack {
	
	private final MyLinkedList myList;

	public MyStack() {
		this.myList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myList.add(myNode);
	}

	public INode peak() {
		return myList.head;
	}
	
	public void printStack() {
		myList.printMyNodes();
	}
	
	public INode pop() {
		return myList.pop();
	}

}
