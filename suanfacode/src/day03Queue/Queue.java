package day03Queue;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-24 23:23
 **/
public interface Queue<E>{
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
