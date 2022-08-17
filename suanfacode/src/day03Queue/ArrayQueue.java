package day03Queue;

import day02Array.Array;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-24 23:25
 **/
public class ArrayQueue<E> implements Queue<E>{
    private Array<E> array;
    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
