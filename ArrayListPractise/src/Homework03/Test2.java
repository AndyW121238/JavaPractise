package Homework03;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    // 键盘录入学生信息
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stuList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            int age = sc.nextInt();
            Student s = new Student(name, age);
            stuList.add(s);
        }
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
    }
}
