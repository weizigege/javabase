package solution;

/**
 * @program: suanfacode
 * @description https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * @author: hu
 * @create: 2022-08-18 23:50
 **/
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        int j =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {

    }
}
