package exceptions;

public class ExceptionIsEmpty extends Exception {
  public ExceptionIsEmpty() {
    super("The list is empty.");
  }
  public ExceptionIsEmpty(String message) {
    super(message);
  }
}