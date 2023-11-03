import com.sun.source.tree.CaseTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;
        boolean loginFlag = false;
        ArrayList<Student> stuList = new ArrayList<>();
        ArrayList<User> usersList = new ArrayList<>();

        do{
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("请输入您的选择:");
            choice = sc.next();
            switch(choice){
                case "1" -> register(usersList);
                case "2" -> {
                    login();
                    loginFlag = true;
                }
                case "3" -> forgetPassword();
                case "4" -> {
                    System.out.println("已退出系统");
                    return;
                }
                default ->  System.out.println("请输入有效的选择!");
            }
        }while(!loginFlag);

        do {
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择:");

            choice = sc.next();

            switch (choice) {
                case "1" -> addStudent(stuList);
                case "2" -> removeStudent(stuList);
                case "3" -> alterStudent(stuList);
                case "4" -> searchStudent(stuList);
                case "5" -> System.out.println("已退出系统");
                default -> System.out.println("请输入有效的选择!");
            }
        } while (!choice.equals("5"));
    }

    // 用户注册
    public static void register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        System.out.println("请输入身份证号码:");
        String id = sc.next();
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();

        User user = new User(name, password, id, phoneNumber);
        list.add(user);

    }

    // 用户登录
    public static void login(){

    }

    // 忘记密码
    public  static void forgetPassword(){

    }

    // 添加学生到学生集合中,id不能重复
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        int id;
        do {
            System.out.println("请输入学生的id:");
            id = sc.nextInt();
            if (studentContains(list, id)) {
                System.out.println("该id已被占用,请重新输入!");
            }
        } while (studentContains(list, id));
        s.setId(id);

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的地址:");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
    }

    // 根据学生id从学生集合中删除对应学生
    public static Student removeStudent(ArrayList<Student> list) {
        // 学生集合为空
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return null;
        }
        // 学生集合不为空
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生id:");
        int key = sc.nextInt();
        int index = getIndexOfStudent(list, key);
        if (index == -1) {
            System.out.println("没有查找相应学生,请重新输入!");
            return null;
        }

        Student s = list.get(index);
        list.remove(index);
        System.out.println("id为:" + key + "的学生对象已成功删除");
        return s;
    }

    // 根据id修改对应学生对象的信息
    public static void alterStudent(ArrayList<Student> list) {
        // 学生集合中没有数据
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return;
        }
        // 学生集合中有数据
        Scanner sc = new Scanner(System.in);

        int key;
        System.out.println("请输入要求改的学生id:");
        key = sc.nextInt();
        if (!studentContains(list, key)) {
            System.out.println("没有查找相应学生,请重新输入!");
            return;
        }
        int index = getIndexOfStudent(list,key);
        System.out.println("请输入修改后的姓名:");
        String name = sc.next();
        list.get(index).setName(name);
        System.out.println("请输入修改后的年龄:");
        int age = sc.nextInt();
        list.get(index).setAge(age);
        System.out.println("请输入修改后的地址:");
        String address = sc.next();
        list.get(index).setAddress(address);
        System.out.println("id为:" + key + "的学生信息修改成功!");
    }

    // 显示学生集合的全部信息
    public static void searchStudent(ArrayList<Student> list) {
        // 学生集合中没有数据
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return;
        }

        // 学生集合中有数据
        System.out.print("id\t\t");
        System.out.print("姓名\t\t");
        System.out.print("年龄\t\t");
        System.out.print("地址");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.print(s.getId() + "\t\t");
            System.out.print(s.getName() + "\t");
            System.out.print(s.getAge() + "\t\t");
            System.out.print(s.getAddress() + "");
            System.out.println();
        }
    }

    // 根据id查询寻学生对象在学生集合中的索引,如果查询到则返回索引,没查找到返回-1
    public static int getIndexOfStudent(ArrayList<Student> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (key == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    // id是否已存在
    public static boolean studentContains(ArrayList<Student> list, int key) {
        return getIndexOfStudent(list, key) != -1;
    }
}
