
class Main {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    NodeDLL head = NodeDLL.createDLL(arr);
    NodeDLL.display(head);
    //head=DeleteDLL.deleteTail(head);
    //NodeDLL.display(head);
    head=DeleteDLL.deleteMidlle(5, head);
    NodeDLL.display(head);
  }
}
