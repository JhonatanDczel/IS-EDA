public interface Stack<T> {
  void push(T x);

  T pop() throws ExceptionIsEmpty;

  T top() throws ExceptionIsEmpty;

  boolean isEmpty();
}
