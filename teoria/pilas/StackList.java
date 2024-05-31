public class StackList<T> {
  //Deberia manejar nodos

  private T array[];
  private int tope;
  

  public StackList(int n) {
    this.array = (T[]) new Object[n];
    this.tope = -1;
  }

  public void push(T x) {
    if (isFull()) {
      T[] aux = (T[]) new Object[this.array.length * 2];
      for (int i = 0; i < this.array.length; i++) {
        aux[i] = this.array[i];
      }
      this.array = aux;
    }
    this.array[++this.tope] = x;
  }

  public boolean isFull() {
    return this.tope == this.array.length - 1;
  }

  public T pop() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("Stack is empty");
    return this.array[this.tope--];
  }
  
  public boolean isEmpty() {
    return this.tope == -1;
  }

}

