import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
    list.insertFirst(10);
    list.insertFirst(0);
    list.sort();
    System.out.println(list);
    System.out.println(list.sort(3));
  }
}