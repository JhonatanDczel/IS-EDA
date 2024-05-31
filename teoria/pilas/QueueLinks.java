
public class QueueLinks<T> implements Queue<T> {
  private Node<T> first;
  private Node<T> last;

  public QueueLinks() {
    this.first = this.last = null;
  }

  public boolean isEmpty() {
    return this.first == null;
  }

  public void enqueue(T x) {
    Node<T> n = new Node<T>(x);
    if (isEmpty()) {
      this.first = this.last = n;
    } else {
      this.last.setNext(n);
      this.last = n;
    }
  }

  public T dequeue() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Queue is empty");
    T x = this.first.getData();
    this.first = this.first.getNext();
    if (this.first == null)
      this.last = null;
    return x;
  }

  public T front() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Queue is empty");
    return this.first.getData();
  }

  public T back() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Queue is empty");
    return this.last.getData();
  }
  @Override
  public String toString() {
    String s = "";
    Node<T> aux = this.first;
    while (aux != null) {
      s += aux.getData() + "\t";
      aux = aux.getNext();
    }
    return s;
  }
}