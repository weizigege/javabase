package day03stack;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-24 14:44
 **/
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        //后进先出
        stack.pop();
        System.out.println(stack);
    }
}
