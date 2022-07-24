package day03stack;

import java.util.Calendar;
import java.util.Stack;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-24 16:09
 **/
// [{()]}括号匹配
public class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='{'||c=='('||c=='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                Character topChart = stack.pop();
                if (c=='('&&topChart!=')'){
                    return false;
                }
                if (c=='['&&topChart!=']'){
                    return false;
                }
                if (c=='{'&&topChart!='}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "[{()}]";
        boolean valid = solution.isValid(s);
        System.out.println(valid);
    }
}
