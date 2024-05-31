public class Test {
  public static void main(String[] args) {
    StackArray<Character> s = new StackArray<Character>(5);
    try {
      s.push('A');
      System.out.println(s);
      s.push('B');
      System.out.println(s);
      s.push('C');
      System.out.println(s);
      s.push('D');
      System.out.println(s + "\t Tope: " + s.top());
      s.push('E');
      System.out.println(s);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
