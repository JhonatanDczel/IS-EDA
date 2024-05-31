public interface Queue<T> {
  void enqueue(T x);

  T dequeue() throws ExceptionIsEmpty;

  T front() throws ExceptionIsEmpty;

  T back() throws ExceptionIsEmpty;

  boolean isEmpty();
}
