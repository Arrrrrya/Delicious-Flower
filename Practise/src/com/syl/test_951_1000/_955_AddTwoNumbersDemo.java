package com.syl.test_951_1000;

import java.util.ArrayList;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 输入 (2 -> 4 ->
 * 3) + (5 -> 6 -> 4) 输出 7 -> 0 -> 8
 * 
 * @from https://leetcode-cn.com/problems/add-two-numbers/
 * @author Arya
 * @email sun_mir@qq.com
 */
public class _955_AddTwoNumbersDemo {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode midListNode = new ListNode(4);
		l1.next = midListNode;
		midListNode.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		midListNode = new ListNode(6);
		l2.next = midListNode;
		midListNode.next = new ListNode(4);

		ListNode listNode = addTwoNumbers(l1, l2);
		System.out.println(listNodeToArrayList(listNode).toString());
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer> list1 = listNodeToArrayList(l1);
		ArrayList<Integer> list2 = listNodeToArrayList(l2);
		Long result = arrayListToInt(list1) + arrayListToInt(list2);
		return intToListNode(result);
	}

	private static ArrayList<Integer> listNodeToArrayList(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(listNode.val);
		ListNode temListNode = listNode.next;
		while (temListNode != null) {
			list.add(temListNode.val);
			temListNode = temListNode.next;
		}
		return list;
	}

	private static Long arrayListToInt(ArrayList<Integer> arrayList) {
		String string = "";
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			string += arrayList.get(i);
		}
		return Long.parseLong(string);
	}

	private static ListNode intToListNode(Long num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String numString = num + "";
		for (int i = 0; i < numString.length(); i++) {
			list.add(Integer.parseInt(numString.charAt(i) + ""));
		}

		ListNode listNode = null;
		ArrayList<ListNode> listNodes = new ArrayList<ListNode>();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			listNode = new ListNode(list.get(i));
			listNodes.add(listNode);
		}
		
		for (int i = 0; i < listNodes.size(); i++) {
			if (i < listNodes.size() - 1) {
				listNodes.get(i).next = listNodes.get(i + 1);
			}
		}
		listNode = listNodes.get(0);
		return listNode;
	}

}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
