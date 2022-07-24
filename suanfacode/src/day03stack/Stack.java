package day03stack;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-23 15:40
 **/
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
