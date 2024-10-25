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
}
