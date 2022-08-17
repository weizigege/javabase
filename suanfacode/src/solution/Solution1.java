package solution;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-08-01 22:57
 * [1,8,6,2,5,4,8,3,7]
 **/
public class Solution1 {
    public int getMaxArea(int[] h){
        int i=0;
        int j=h.length-1;
        int res = 0;
        while (i<j){
            res=h[i]<h[j]?Math.max(res,(j-i)*h[i++]):Math.max(res,(j-i)*h[j--]);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maxArea = solution1.getMaxArea(arr);
        System.out.println(maxArea);
    }
}
