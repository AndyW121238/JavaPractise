import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;
        ArrayList<Student> stuList = new ArrayList<>();

        do {
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择:");

            choice = sc.next();

            switch (choice){
                case "1" -> addStudent(stuList);
                case "2" -> removeStudent(stuList);
                case "3" -> alterStudent(stuList);
                case "4" -> searchStudent(stuList);
                case "5" -> System.out.println("已退出系统");
                default -> System.out.println("请输入有效的选择!");
            }
        } while (!choice.equals("5"));
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        int id;
        do {
            System.out.println("请输入学生的id:");
            id = sc.nextInt();
            if(contains(list,id)){
                System.out.println("该id已被占用,请重新输入!");
            }
        } while (contains(list,id));
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
    public static void removeStudent(ArrayList<Student> list){

    }
    public static void alterStudent(ArrayList<Student> list){

    }
    public static void searchStudent(ArrayList<Student> list){
        // 学生集合中没有数据
        if(list.size() == 0){
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
            System.out.print(s.getName() + "\t\t");
            System.out.print(s.getAge() + "\t\t");
            System.out.print(s.getAddress() + "");
        }
    }

    public static boolean contains (ArrayList<Student> list, int key){
        for (int i = 0; i < list.size(); i++) {
            if(key == list.get(i).getId()){
                return true;
            }
        }
        return false;
    }
}
