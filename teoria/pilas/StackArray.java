public class StackArray<T> {
  private T array[];
  private int tope;

  public StackArray(int n) {
    this.array = (T[]) new Object[n];
    this.tope = -1;
  }

  public void push(T x) {
    if (!isFull()) {
      this.array[++this.tope] = x;
    }
  }

  //para eliminar un elemento de la pila
  public T pop() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Stack is empty");
    return this.array[this.tope--];
  }

  public T top() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Stack is empty");
    return this.array[this.tope];
  }

  public boolean isEmpty() {
    return this.tope == -1;
  }

  public boolean isFull() {
    return this.tope == this.array.length - 1;
  }

  @Override
  public String toString() {
    String s = "";
    for (int i = this.tope; i >= 0; i--) {
      s += this.array[i] + "\t";
    }
    return s;
  }

}
