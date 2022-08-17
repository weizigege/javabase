package day03Queue;


import org.junit.Test;

import java.util.Stack;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-08-06 22:26
 **/
public class TeststackAndqueue {

    @Test
    public void test01(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
