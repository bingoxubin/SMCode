package com.bingoabin.tree;

import java.util.Stack;

/**
 * @author bingoabin
 * @date 2022/4/30 21:30
 */
public class PostOrder {
	public static void main(String[] args){
		int[] postorder = {3,6,5,9,8,11,13,12,10};
		System.out.println(new PostOrder().verifyPostorder(postorder));
	}

	public boolean verifyPostorder(int[] postorder) {
		Stack<Integer> stack = new Stack<>();
		int parent = Integer.MAX_VALUE;
		//注意for循环是倒叙遍历的
		for (int i = postorder.length - 1; i >= 0; i--) {
			int cur = postorder[i];
			//当如果前节点小于栈顶元素，说明栈顶元素和当前值构成了倒叙，
			//说明当前节点是前面某个节点的左子节点，我们要找到他的父节点
			while (!stack.isEmpty() && stack.peek() > cur)
				parent = stack.pop();
			//只要遇到了某一个左子节点，才会执行上面的代码，才会更
			//新parent的值，否则parent就是一个非常大的值，也就
			//是说如果一直没有遇到左子节点，那么右子节点可以非常大
			if (cur > parent)
				return false;
			//入栈
			stack.add(cur);
		}
		return true;
	}
}
