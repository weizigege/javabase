package day02Array;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-01-05 23:32
 **/
public class Array {
    private  int[] data;
    private  int size;

    public  Array(int capacity){
        data=new int[capacity];
        size=0;
    }
    public  Array(){
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
    public boolean isEmpty(){
        return size==0;
    }

    public void addlast(int e){
        if(size==data.length){
            throw  new IllegalArgumentException("add last fail!");
        }
        data[size]=e;
        size++;
    }
}
