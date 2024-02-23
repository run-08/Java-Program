class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        if(current1 == null){
            return current2;
        }
        if(current2 == null){
            return current1;
        }
        while(current1 != null && current2 != null){
            if(current1.val < current2.val){
                res.next = current1;
                current1 = current1.next;
            }
            else{
                res.next = current2;
                current2 = current2.next;
            }
            res = res.next;
        }
        if(current1 != null){
            res.next = current1;
        }
        if(current2 != null){
            res.next = current2;
        }
        return temp.next;
    }
}