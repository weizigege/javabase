package day01;

import org.junit.Test;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2021-12-08 23:46
 **/
public class Testcase {
    @Test
    public void test1(){
        int[] digits ={1,9,9,9};
        Solution solution = new Solution();
        int[] arr = solution.plusOne(digits);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    @Test
    public void test2(){
        int[] digits ={1,9,9,9};
        digits = new int[digits.length+1];
        digits[0]=1;
        for (int i : digits) {
            System.out.println(i);
        }
    }

    class Solution {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for (int i = len - 1; i >= 0; i--) {
                digits[i] = (digits[i] + 1) % 10;
                if (digits[i] != 0) {
                    return digits;
                }
            }
            digits = new int[len + 1];
            digits[0] = 1;
            return digits;
        }
    }

    @Test
    public void test3(){
        int[] digits ={6,1,2,4,3,5};
        int[] arr = sort(digits);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr;
    }


}
