package day02Array;

import org.junit.Test;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-21 23:20
 **/
public class Test01 {
    @Test
    public void testcase01(){
        Array array = new Array(20);
        for (int i = 0; i <10 ; i++) {
            array.addlast(i);
        }
        System.out.println(array);
    }
}
