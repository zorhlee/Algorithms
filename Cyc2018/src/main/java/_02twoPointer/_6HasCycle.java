package _02twoPointer;

import java.util.HashSet;

/**
 * @Author: dell5471
 * @Description:
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 141
 * 快慢指针
 * @Date: 2021/12/17 9:21
 * @Version: 1.0
 */
public class _6HasCycle {

    /**
     *快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head){
       if(head==null||head.next==null)  return false;
       ListNode slow =head;
       ListNode fast =head.next;
       while(slow!=fast){
           if(fast==null||fast.next==null)  return false;

           slow=slow.next;
           fast=fast.next.next;
       }

       return true;
    }

    /**
     * (1)利用hashTable中key的唯一性来判断
     *（2）set的add方法只会添加set集合里没有的元素
     * @param head
     * @return
     */
    public boolean hasCycle02(ListNode head){
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)) return true;
            head=head.next;
        }
        return false;
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
