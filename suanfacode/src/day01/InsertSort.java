package day01;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2021-12-28 22:10
 **/
public class InsertSort {
    public static  <E extends Comparable<E>> void sort(E[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j=i;j-1>=0;j--){
                if (arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr={3,2,4,5,1,6,7};
        sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    public static <E> void swap(E[] arr,int i,int j){
        E t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
