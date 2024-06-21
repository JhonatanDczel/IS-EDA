import nodes.Node;

public class LinkedList<T> {
  protected int count;
  protected Node<T> head;

  public LinkedList() {
    this.count = 0;
    this.head = null;
  }

  public void insertFirst(T x) {
    insertKesimo(x, 0);
  }

  public void insertKesimo(T item, int index) {
    if (index == 0) {
      Node<T> newNode = new Node<T>(item);
      newNode.setNext(this.head);
      this.head = newNode;
    } else if (index >= this.count) {
      System.out.println("Fuera de los limites");
    } else {
      Node<T> current = this.head;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      Node<T> newNode = new Node<T>(item, current.getNext());
      current.setNext(newNode);
    }
  }

  public void insertLast(T x){
    insertKesimo(x, count);
  }
}
