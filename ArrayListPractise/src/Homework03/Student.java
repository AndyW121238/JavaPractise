package Homework03;

public class Student {
    // 定义一个集合,添加一些学生对象,并进行遍历
    // 学生类的属性为:姓名,年龄
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
