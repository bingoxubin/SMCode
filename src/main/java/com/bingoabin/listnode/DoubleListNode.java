package com.bingoabin.listnode;

/**
 * @author bingoabin
 * @date 2022/4/19 11:47
 */
public class DoubleListNode {
	public static void main(String[] args) {
		// head -> tail
		Node head = new Node(0);
		Node tail = new Node(-1);
		head.after = tail;
		tail.pre = head;

		//构造链表
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		node2.pre = node1;
		node1.after = node2;

		head.after = node1;
		node1.pre = head;

		tail.pre = node2;
		node2.after = tail;

		//0 1 3 2 -1
		insertNode(head, tail, 0, new Node(3));

		//测试打印
		while (head != null) {
			System.out.println(head.val);
			head = head.after;
		}
	}

	//实现在双向链表中，某个位置插入node节点
	//0 -> 1 -> 2 -> -1
	public static void insertNode(Node head, Node tail, int index, Node node) {
		while (head != null && index > 0) {
			head = head.after;
			index--;
		}
		if (head == null) {
			Node temp = tail.pre;
			node.after = tail;
			temp.after = node;
			tail.pre = node;
			node.pre = temp;
		} else {
			Node temp = head.after;
			node.after = head.after;
			head.after = node;
			node.pre = head;
			temp.pre = node;
		}
	}
}

class Node {
	int val;
	Node pre;
	Node after;

	Node(int val) {
		this.val = val;
	}
}