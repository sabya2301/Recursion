package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
    }

//--------------------------------------------------------------
    // REVERSE STRING(344)
    public void reverseString(char[] s) {
        helper(s, 0, s.length);
    }

    public void helper(char[] s, int i, int n){
        if(i >= n/2) return;
        char c = s[i];
        s[i] = s[n-1-i];
        s[n-1-i] = c;
        helper(s, i+1, n);
    }
//--------------------------------------------------------------
    // REVERSE LINKED LIST(206)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode revHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return revHead;
    }

//--------------------------------------------------------------
    // FIBONACCI NUMBER(509)
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
//--------------------------------------------------------------
    // REMOVE A CERTAIN ELEMENT FROM LINKED LIST(203)
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return removeElements(head.next, val);
        head.next = removeElements(head.next, val);
        return head;
    }
//--------------------------------------------------------------
    //MERGER TWO SORTED LINKED LIST(21)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

//--------------------------------------------------------------
    // POWER OF FOUR(342)
    public boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4) return true;
        if (n < 4) return false;
        if (n != ((n / 4) * 4)) return false;
        return isPowerOfFour(n / 4);
    }
//--------------------------------------------------------------

//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
//--------------------------------------------------------------
}
