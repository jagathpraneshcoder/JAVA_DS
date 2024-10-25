class NodeDLL {
  int data;
  NodeDLL next;
  NodeDLL prev;

  private NodeDLL() {

  }

  private NodeDLL(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }

  private NodeDLL(int data, NodeDLL next, NodeDLL prev) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }

  static NodeDLL createDLL(int[] arr) {
    NodeDLL head = new NodeDLL(arr[0]);
    NodeDLL temp = head;

    for (int i = 1; i < arr.length; i++) {
      NodeDLL tDll = new NodeDLL(arr[i], null, temp);
      temp.next = tDll;
      temp = temp.next;
    }

    return head;
  }

  static void display(NodeDLL head) {
    NodeDLL temp = head;
    while (temp.next != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.print(temp.data);
    System.out.println();
    while (temp.prev != null) {
      System.out.print(temp.data + "->");
      temp = temp.prev;
    }
    System.out.print(temp.data);
    System.out.println();
  }

}