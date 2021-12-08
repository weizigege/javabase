package day01;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2021-12-09 00:23
 **/
public class TwoSum {
    public int[] sum(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        
    }
}
