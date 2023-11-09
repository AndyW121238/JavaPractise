import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();

        Student s1 = new Student("王倪佳", 21, "男");
        Student s2 = new Student("倪晨", 20, "男");
        Student s3 = new Student("王宗琪", 19, "男");
        Student s4 = new Student("罗小果", 35, "男");

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        System.out.println("集合中最大的年龄为:" + StudentUtil.getOldest(s));
    }
}
