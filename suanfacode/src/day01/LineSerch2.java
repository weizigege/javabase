package day01;

/**
 * @program: suanfacode
 * @description 线性查找
 * @author: hu
 * @create: 2021-12-08 21:45
 **/
public class LineSerch2<E> {
    public <E> int serch(E[] arr,E target){
        for(int i=0;i<arr.length;i++){
            if (arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Integer[] data={1,3,45,64,65,4,3};
        Student[] students={new Student("zhangshan"),
        new Student("lisi"),
                new Student("wangwu")};
        Student student = new Student("wangwu");
        LineSerch2 lineSerch2 = new LineSerch2();
        int res = lineSerch2.serch(students, student);
        System.out.println(res);
    }
}
