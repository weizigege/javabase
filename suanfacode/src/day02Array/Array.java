package day02Array;

import java.util.Arrays;
import java.util.Objects;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-01-05 23:32
 **/
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E [])new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public E[] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addlast(E e) {
        if (size == data.length) {
            resize(2*data.length);
        }
        data[size] = e;
        size++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index illegall");
        }
        return data[index];
    }

    void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index illegall");
        }
        data[index] = e;
    }

    //查找是包含元素e
    public boolean contains(E e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找是存在元素e
    public int find(E e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove fail");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i-1]=data[i];
        }
        if (size==data.length/2){
            resize(data.length/2);
        }
        size--;
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removelast(){
        return remove(size-1);
    }

    public void removeElement(E e){
        int index = find(e);
        if (index!=-1){
            remove(index);
        }
    }
    /**
     * 索引处添加元素e
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (size == data.length) {
            resize(2*data.length);
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add  fail!");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array size = %d , capacity = %d\n", size, data.length));
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1)
                sb.append(",");
        }
        sb.append(']');
        return sb.toString();
    }

    public void resize(int NewCapacity){
        E[] newarray = (E [])new Object[NewCapacity];
        for (int i = 0; i < size; i++) {
            newarray[i]=data[i];
        }
        data=newarray;
    }
}
