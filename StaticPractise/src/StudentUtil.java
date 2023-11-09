import java.util.ArrayList;

public class StudentUtil {
    // 学生工具类,用于获取集合中年龄最大的学生的年龄.
    private StudentUtil(){}

    public static int getOldest(ArrayList<Student> s){
        int oldest = s.get(0).getAge();
        for (int i = 1; i < s.size(); i++) {
            if(s.get(i).getAge() > oldest){
                oldest = s.get(i).getAge();
            }
        }
        return oldest;
    }
}
