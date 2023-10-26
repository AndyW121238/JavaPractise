import java.util.Scanner;

public class Homework02 {
    // 给定两个整数,被除数和除数(都是正数,且不超过int范围).
    // 将两个数相除,要求不使用乘法、除法和%运算符得到商和余数
    public static void main(String[] args) {
        int quotient = 0; // 商
        int remainder = 0;// 余数
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1 >= num2) {
            num1 = num1 - num2;
            quotient ++;
        }
        remainder = num1;
        System.out.println("商" + quotient);
        System.out.println("余数" + remainder);
    }
}
