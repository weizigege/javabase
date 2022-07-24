package day03stack;

import day02Array.Array;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-23 15:42
 **/
public class ArrayStack<E> implements Stack<E>{
    Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void push(E e) {
        array.addlast(e);
    }

    @Override
    public E pop() {
        return array.removelast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("stack:");
        sb.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.get(i));
            if(i!=array.getSize()-1){
                sb.append(",");
            }
        }
        sb.append("] top");
        return  sb.toString();
    }

}
