package interfaces;

import exceptions.ExceptionIsEmpty;
import exceptions.ExceptionIsFull;

public interface ListInterface<T> {
  void insertFirst(T x) throws ExceptionIsFull;

  void insertLast(T x) throws ExceptionIsFull;

  boolean search(T x) throws ExceptionIsEmpty;

  void remove(T x) throws ExceptionIsEmpty;

  int length();

  boolean isEmpty();
}
