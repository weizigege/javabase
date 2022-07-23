package day02Array;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-07-23 13:02
 **/
public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> array = new Array<>(10);
        array.addlast(new Student("zhangshan",12));
        array.addlast(new Student("lisi",13));
        array.addlast(new Student("wangwu",14));
        System.out.println(array);
    }
}
