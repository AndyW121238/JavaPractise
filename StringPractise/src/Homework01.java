import java.util.Scanner;

public class Homework01 {
    // 键盘接受一个字符串,程序判断出该字符串是否为对称字符串,并在控制台打印结果
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str1 = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        String str2 = sb.reverse().toString();
        System.out.println(str1.equals(str2));
    }
}
