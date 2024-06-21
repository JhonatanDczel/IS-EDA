package exceptions;

public class ExceptionIsFull extends Exception {
  public ExceptionIsFull() {
    super("The list is full.");
  }

  public ExceptionIsFull(String str){
    super(str);
  }
}
