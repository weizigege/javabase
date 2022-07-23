package day02Array;

import java.util.Arrays;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-01-05 23:32
 **/
public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
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

    public void addlast(int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("add last fail!");
        }
        data[size] = e;
        size++;
    }

    public void addFirst(int e) {
        add(0, e);
    }

    int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index illegall");
        }
        return data[index];
    }

    void set(int index, int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index illegall");
        }
        data[index] = e;
    }

    //查找是包含元素e
    public boolean contains(int e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    //查找是存在元素e
    public int find(int e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == e) {
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
    public int remove(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("remove fail");
        }
        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i-1]=data[i];
        }
        size--;
        return ret;
    }

    public int removeFirst(){
        return remove(0);
    }

    public int removelast(){
        return remove(size-1);
    }

    public void removeElement(int e){
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
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("add  fail!");
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
}
