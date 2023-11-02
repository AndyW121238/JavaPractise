package Homework03;

import java.util.ArrayList;

public class Test {
    // 定义一个集合,添加一些学生对象,并进行遍历
    // 学生类的属性为:姓名,年龄
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("王倪佳", 21);
        Student stu2 = new Student("倪晨", 20);
        stuList.add(stu1);
        stuList.add(stu2);
        for (int i = 0; i < stuList.size(); i++) {
            Student s = stuList.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
