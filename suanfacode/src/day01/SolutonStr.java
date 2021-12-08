package day01;

/**
 * @program: suanfacode
 * @description
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 *
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 *
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 *
 * @author: hu
 * @create: 2021-12-08 21:56
 **/
public class SolutonStr {

    public int getlenth(String str){
        return str.length()-str.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        SolutonStr solutonStr = new SolutonStr();
        int res = solutonStr.getlenth("   fly me   to   the moon  ");
        System.out.println(res);
    }
}
