class DeleteDLL {
  static NodeDLL deleteHead(NodeDLL head) {
    if (head == null || head.next == null) {
      return null;
    }

    NodeDLL prev = head;
    head = head.next;
    head.prev = null;
    prev.next = null;
    return head;
  }

  static NodeDLL deleteTail(NodeDLL head) {
    if (head == null || head.next == null)
      return null;

    NodeDLL tail = head;
    NodeDLL copy = null;
    while (tail.next != null) {
      tail = tail.next;
    }

    copy = tail.prev;
    tail.prev = null;
    copy.next = null;
    return head;

  }

  static NodeDLL deleteMidlle(int k,NodeDLL head){
    NodeDLL temp=head;
    int count=1;
    while(temp!=null){
      if(count==k) break;
      count++;
      temp=temp.next;
    }
    if(temp==null) return head;
    NodeDLL front = temp.next;
    NodeDLL back = temp.prev;

    if(front == null && back == null) return null;
    else if(front == null){
      System.out.println("back");
      head=deleteTail(head);
      return head;
    }
    else if(back==null){
      System.out.println("front");
      head=deleteHead(head);
      return head;
    }
    else{
      System.out.println("middle");
      front.prev=back;
      back.next=front;
      temp.prev=temp.next=null;
    }
    return head;
  }
}
