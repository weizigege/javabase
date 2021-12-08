package day01;

/**
 * @program: suanfacode
 * @description 线性查找
 * @author: hu
 * @create: 2021-12-08 21:45
 **/
public class LineSerch {
    public int serch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] data={1,3,45,64,65,4,3};
        LineSerch lineSerch = new LineSerch();
        int res = lineSerch.serch(data, 45);
        System.out.println(res);
    }
}
