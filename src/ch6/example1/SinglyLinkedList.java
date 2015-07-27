package ch6.example1;

public class SinglyLinkedList<E> implements Cloneable {
	// ---------------- nested Node class ----------------
	private static class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	// instance variables of the SinglyLinkedList
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	public SinglyLinkedList() {
	} // constructs an initially empty list

	// access methods
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() { // returns (but does not remove) the first element
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public void displayAllNodes(int j) {
		Node<E> n = head;
		for (int i = 0; i < size * j; i++) {

			try {
				System.out.println(n.getElement());

				n = n.getNext();

			} catch (java.lang.NullPointerException e) {
				n = head;
			}

			// System.out.println(n.getNext().getElement());
		}

	}

	public E last() { // returns (but does not remove) the last element
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) { // adds element e to the front of the list
		head = new Node<>(e, head); // create and link a new node
		if (size == 0)
			tail = head; // special case: new node becomes tail also
		size++;
	}

	public void addLast(E e) { // adds element e to the end of the list
		Node<E> newest = new Node<>(e, null); // node will eventually be the
												// tail
		if (isEmpty())
			head = newest; // special case: previously empty list
		else
			tail.setNext(newest); // new node after existing tail
		tail = newest; // new node becomes the tail
		size++;
	}

	public E removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		E answer = head.getElement();
		head = head.getNext(); // will become null if list had only one node
		size--;
		if (size == 0)
			tail = null; // special case as list is now empty
		return answer;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		SinglyLinkedList other = (SinglyLinkedList) o; // use nonparameterized
														// type
		if (size != other.size)
			return false;
		Node walkA = head; // traverse the primary list
		Node walkB = other.head; // traverse the secondary list
		while (walkA != null) {
			if (!walkA.getElement().equals(walkB.getElement()))
				return false; // mismatch
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		return true; // if we reach this, everything matched successfully
	}
	 public static int[ ][ ] deepClone(int[ ][ ] original) { 
		 int[ ][ ] backup = new int[original.length][ ]; // create top-level array of arrays
		 for (int k=0; k < original.length; k++)
		 backup[k] = original[k].clone( ); // copy row k
		 return backup;
		 }
	 public SinglyLinkedList<E> clone( ) throws CloneNotSupportedException { 
		// always use inherited Object.clone() to create the initial copy
		SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone( ); // safe cast
		if (size > 0) { // we need independent chain of nodes
		other.head = new Node<>(head.getElement( ), null);
		Node<E> walk = head.getNext( ); // walk through remainder of original list
		Node<E> otherTail = other.head; // remember most recently created node
		while (walk != null) { // make a new node storing same element
		Node<E> newest = new Node<>(walk.getElement( ), null);
		 otherTail.setNext(newest); // link previous node to this one
		 otherTail = newest;
		 walk = walk.getNext( );
		 } 
		 } 
		 return other;
		 }

	public static void main(String[] ar) {
		SinglyLinkedList<String> obj = new SinglyLinkedList<>();
		SinglyLinkedList<String> obj1 = new SinglyLinkedList<>();

		obj1.addFirst("Ram Gauro");
		obj.addFirst("Ram Gauro");
		System.out.println(obj.equals(obj1));
		obj.addFirst("SIta Chaudhary ");
		obj.addLast("shankar Rai");
		obj.addFirst("Tasi Gurung");

		System.out.println(obj.equals(obj1));
		System.out.println(obj.first());
		System.out.println(obj.last());

		System.out.println(obj.size);
		obj.displayAllNodes(3);

	}
}