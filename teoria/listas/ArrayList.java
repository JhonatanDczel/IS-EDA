package listas;

import exceptions.ExceptionIsEmpty;
import exceptions.ExceptionIsFull;

public class ArrayList<T> implements interfaces.ListInterface<T> {
  private T[] list;
  private int size;
  private int capacity;

  public ArrayList(int n) {
    list = (T[]) new Object[n];
    size = 0;
  }

  @Override
  public void insertFirst(T x) throws ExceptionIsFull {
    if (capacity == size)
      throw new ExceptionIsFull();
    list[size++] = x;
  }

  @Override
  public void insertLast(T x) throws ExceptionIsFull {
    if (capacity == size)
      throw new ExceptionIsFull();
    list[size++] = x;
  }

  public void insert(T x) throws ExceptionIsFull {
    insertFirst(x);
  }

  @Override
  public boolean search(T x) {
    for (int i = 0; i < list.length; i++) {
      if (x.equals(list[i])) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void remove(T x) throws ExceptionIsEmpty {
    if (size == 0)
      throw new ExceptionIsEmpty();
    for (int i = 0; i < list.length; i++) {
      if (list[i].equals(x)) {
        list[i] = null;
        size--;
      }
    }
  }

  @Override
  public int length() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }
}