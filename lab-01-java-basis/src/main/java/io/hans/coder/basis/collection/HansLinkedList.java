package io.hans.coder.basis.collection;

import java.io.Serializable;
import java.util.*;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/02/02 21:12
 */
public class HansLinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable {

    transient Node<E> first;

    transient Node<E> last;

    transient int size;

    public HansLinkedList(){

    }

    public HansLinkedList(Collection<? extends E> c){
        this();
        addAll(c);
    }



    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        final Node<E> f = first;
        if (f == null){
            throw new NoSuchElementException();
        }
        return f.item;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> next, E item, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
