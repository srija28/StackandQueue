package com.capgemini;
import org.junit.Test;

import org.junit.Assert;

public class MyQueueTest {
	@Test
	public void toPerformQueueTestforQueue() {
		MyQueue queue = new MyQueue();
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		queue.enQueue(myFirstNode);
		queue.enQueue(mySecondNode);
		queue.enQueue(myThirdNode);
		queue.printQueue();
		int size = queue.size();
		Assert.assertEquals(3, size);
	}
}

