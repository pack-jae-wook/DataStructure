public class Node <E>{
   private E       item;
   private Node<E> next;
   public Node(E item, Node<E> next) {
		super();
		this.item = item;
		this.next = next;
	}
   public E getItem() { return item; }
   public Node<E> getNext() {return next;}
   public void setItem(E newItem) {item = newItem;}
   public void setNext(Node<E> newNext) {next = newNext;}
   
}
