package day01;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2021-12-11 21:26
 **/
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if (this==student){
            return true;
        }
        if (this.getClass()!=student.getClass()){
            return false;
        }
        if (student==null){
            return false;
        }
        Student another=(Student)student;
        return this.name.equals(another.name);
    }
}
