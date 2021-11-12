package com.company;

public class ThreadSafeLinkedList {
    int size;
    ListNode head;

    public ThreadSafeLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public void addAtPosition(int index, int element){
        synchronized (this) {
            if (index > size || index < 0) {
                throw new IndexOutOfBoundsException("over index");
            }
            ++size;
            ListNode pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            ListNode toAdd = new ListNode(element);
            toAdd.next = pred.next;
            pred.next = toAdd;
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (this) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("over index");
            }
            size--;
            ListNode pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            pred.next = pred.next.next;
        }
    }

    public int getFirst() {
        synchronized (this) {
            if (size == 0) {
                throw new NullPointerException();
            }
            return head.next.val;
        }
    }

    public int getLast() {
        synchronized (this) {
            if (size == 0) {
                throw new NullPointerException();
            }
            ListNode pred = head.next;
            while (pred.next != null) {
                pred = pred.next;
            }
            return pred.val;
        }
    }

    public int size(){
        synchronized (this) {
            return size;
        }
    }

}
