package jixiang.study;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jixiang
 */
public class Teacher {
    public static ThreadLocal<String> t1=new ThreadLocal<String>();
    public static void main(String[] args) {
        Point p1=new Point(0,0);
        Point p2=new Point(1,1);
        Point p3=new Point(1,-1);
        System.out.println(Thread.currentThread().toString());
    }
    /**
     * 排序好链表，让head指针指向的节点值最小
     */
    public ListNode sortList(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        head.next=sortList(head.next);
        ListNode current=head;
        while(current.next!=null){
            ListNode next=current.next;
            if(current.val>next.val){
                int tmp=current.val;
                current.val=next.val;
                next.val=tmp;
            }
            current=next;
        }
        //这里head指针从头到尾都没改变指向，只不过是改变了head指向的值
        return head;
    }

}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
     }
 }
class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}