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

  public int length() {
    return this.count;
  }

  protected void destroyList() {
    for (Node<T> current = this.head; current != null; current = this.head)
      remove(current.getData());
    count = 0;
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

  public int search(T item) {
    Node<T> current = this.head;
    while (current != null) {
      if (current.getData().equals(item))
        return 1;
      current = current.getNext();
    }
    return 0;
  }
  public void remove(T item) {
    Node<T> current = this.head;
    Node<T> previous = null;
    boolean found = false;
    while (current != null && !found) {
      if (current.getData().equals(item)) {
        found = true;
      } else {
        previous = current;
        current = current.getNext();
      }
    }
    if (found) {
      if (current == this.head) {
        this.head = this.head.getNext();
      } else {
        previous.setNext(current.getNext());
      }
      this.count--;
    }
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<T> current = this.head;
    while (current != null) {
      sb.append(current.toString());
      current = current.getNext();
    }
    return sb.toString();
  }
}
