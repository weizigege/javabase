package day03Queue;

import java.util.Arrays;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-25 22:05
 **/
public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front,tail;
    private int size;

    public  LoopQueue(int capacity){
        data = (E[])new Object[capacity+1];
    }

    public  LoopQueue(){
       this(10);
    }

    public int getCapaCity(){
        return data.length-1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    @Override
    public void enqueue(E e) {
        if ((tail+1)%data.length==front){
            resize(getCapaCity()*2);
        }
        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;
    }

    private void resize(int newcapacity) {
        E[] newData=(E[])new Object[newcapacity+1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front+i)%data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("dequeue fail");
        }
        E ret = data[front];
        data[front] = null;
        front = (front+1)%data.length;
        size--;
        if (size==getCapaCity()/4&&getCapaCity()/2!=0){
            resize(getCapaCity()/2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("getfront fail");
        }

        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Queue: size: %d, capacity = %d\n",size,getCapaCity()));
        sb.append("front [");
        for (int i = front; i!=tail ;i = (i+1)%data.length) {
            sb.append(data[i]);
            if ((i+1)%data.length!=tail){
                sb.append(',');
            }
        }
        sb.append("] tail");
        return sb.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            System.out.println(i);
            if (i%3==2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
