package ch8.example1;
import java.util.Iterator;

import ch7.example1.*;

//---------------- nested ElementIterator class ----------------
/* This class adapts the iteration produced by positions() to return elements. */
private class ElementIterator implements Iterator<E> {
Iterator<Position<E>> posIterator = positions( ).iterator( );
public boolean hasNext( ) { return posIterator.hasNext( ); }
public E next( ) { return posIterator.next( ).getElement( ); } // return element!
public void remove( ) { posIterator.remove( ); }
}

/** Returns an iterator of the elements stored in the tree. */
public Iterator<E> iterator( ) { return new ElementIterator( );
/** Returns an iterable collection of positions of the tree in breadth-first order. */
public Iterable<Position<E>> breadthfirst( ) { 
List<Position<E>> snapshot = new ArrayList<>( );
if (!isEmpty( )) { 
Queue<Position<E>> fringe = new LinkedQueue<>( );
fringe.enqueue(root( )); // start with the root
while (!fringe.isEmpty( )) { 
Position<E> p = fringe.dequeue( ); // remove from front of the queue
snapshot.add(p); // report this position
 for (Position<E> c : children(p))
 fringe.enqueue(c); // add children to back of queue
 } 
 } 
 return snapshot;
 }
/** Adds positions of the subtree rooted at Position p to the given snapshot. */
private void inorderSubtree(Position<E> p, List<Position<E>> snapshot) {
if (left(p) != null)
inorderSubtree(left(p), snapshot);
snapshot.add(p);
if (right(p) != null)
inorderSubtree(right(p), snapshot);
}
/** Returns an iterable collection of positions of the tree, reported in inorder. */
 public Iterable<Position<E>> inorder( ) {
 List<Position<E>> snapshot = new ArrayList<>( );
 if (!isEmpty( ))
 inorderSubtree(root( ), snapshot); // fill the snapshot recursively
 return snapshot;
 }
 /** Overrides positions to make inorder the default order for binary trees. */
 public Iterable<Position<E>> positions( ) {
 return inorder( );
 }

}