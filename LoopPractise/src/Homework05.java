import java.util.Scanner;

public class Homework05 {
    // 从键盘录入一个整数,判断书否为质数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是一个质数");
        }else {
            System.out.println(num + "不是一个质数");
        }
    }
}
