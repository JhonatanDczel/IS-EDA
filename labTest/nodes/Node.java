package nodes;

public class Node<T> {
  protected T data;
  protected Node<T> next;

  public Node(T x, Node<T> next) {
    this.data = x;
    this.next = next;
  }

  public Node(T x) {
    this(x, null);
  }

  public Node() {
    this(null, null);
  }

  public T getData() {
    return this.data;
  }

  public T setData(T x) {
    return this.data = x;
  }

  public void setNext(Node<T> n) {
    this.next = n;
  }

  public Node<T> getNext() {
    return this.next;
  }

  @Override
  public String toString() {
    return this.data.toString();
  }
}
