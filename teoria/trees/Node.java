class Node<E> {
  private E data;
  private Node<E> left; 
  private Node<E> right;

  public Node(E data, Node<E> left, Node<E> right){
    this.data = data;
    this.left = left; 
    this.right = right;
  }
  public Node(E data){
  this(data, null, null);
  }
}
