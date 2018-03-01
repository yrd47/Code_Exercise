package Problem05;

import java.util.Stack;

/**
 * Created by yrd on 2018/3/1.
 *
 * 剑指Offer 面试题5
 * 从尾到头打印链表
 */
public class Problem05 {

    public static class ListNode {
        int val;
        ListNode next;
    }

    /**
     * 使用栈
     *
     * @param root 链表头结点
     */
    public static void printListInverselyUsingIteration(ListNode root) {
        Stack<ListNode> listNodes = new Stack<>();
        while (root != null) {
            listNodes.push(root);
            root = root.next;
        }
        ListNode tmp;
        while (!listNodes.isEmpty()) {
            tmp = listNodes.pop();
            System.out.print(tmp.val + " ");
        }
    }

    /**
     * 使用递归实现
     *
     * @param root
     */
    public static void printListInverselyUsingRecursion(ListNode root) {
        if (root != null) {
            printListInverselyUsingRecursion(root.next);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode();
        root.val = 1;
        root.next = new ListNode();
        root.next.val = 2;
        root.next.next = new ListNode();
        root.next.next.val = 3;
        printListInverselyUsingRecursion(root);
        System.out.println();
        printListInverselyUsingIteration(root);
    }
}
