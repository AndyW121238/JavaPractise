import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // StringJoiner没有空参构造
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("a");
        sj.add("b");
        System.out.println(sj);
    }
}
