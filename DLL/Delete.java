class Delete {
  static Node deleteFront(Node head){
		if( head == null || head.next == null) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		head.prev = null;
		return head;
	}

	static Node deleteRear(Node head){
		Node temp = head;
		Node shadow = null;
		while(temp.next!=null){
			shadow = temp;
			temp = temp.next;
		}
		shadow.next = null;
		temp.prev = null;
		return head;
	}
}
