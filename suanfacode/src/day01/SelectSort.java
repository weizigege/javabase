package day01;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2021-12-21 23:16
 **/
public class SelectSort {
    public static <E extends Comparable> void sort(E[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0){
                    swap(arr,i,j);
                }
            }
        }

    }

    public static void main(String[] args) {
        Integer[] arr = {3,2,4,5,8,6,9,1};
        sort(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    public static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
