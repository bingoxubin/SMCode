package com.bingoabin.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author bingoabin
 * @date 2022/4/20 12:27
 */
public class TreeTest {
	public static void main(String[] args) {
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2, node4, node5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3, node6, node7);
		TreeNode node1 = new TreeNode(1, node2, node3);

		TreeTest treeTest = new TreeTest();
		System.out.println(treeTest.lowestCommonAncestor(node1, node4, node5).val);
	}

	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == root || q == root) return root;
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left == null) return right;
		if (right == null) return left;
		return root;
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Deque<TreeNode> stack = new LinkedList<>();
		Deque<TreeNode> ppath = new LinkedList<>();
		Deque<TreeNode> qpath = new LinkedList<>();

		search(root, p, stack, ppath);
		stack.clear();
		search(root, q, stack, qpath);

		TreeNode res = null;
		while (!ppath.isEmpty() && !qpath.isEmpty()) {
			TreeNode temp1 = ppath.removeFirst();
			TreeNode temp2 = qpath.removeFirst();
			if (temp1 == temp2) {
				res = temp1;
			}
		}
		return res;
	}

	//搜索节点
	//最终目标节点
	//路径的栈
	//最终的path路径
	public void search(TreeNode node, TreeNode search, Deque<TreeNode> stack, Deque<TreeNode> path) {
		if (node == null) return;
		stack.addLast(node);
		if (node == search) {
			path.addAll(stack);
			return;
		}
		search(node.left, search, stack, path);
		search(node.right, search, stack, path);
		stack.removeLast();
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}