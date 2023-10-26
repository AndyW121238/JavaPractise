import java.util.Scanner;

public class Homework04 {
    // 键盘录入一个大于等于2的整数x,计算并返回x的平方根
    // 结果只保留整数部分,小数部分舍弃
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = 1;
        while(square * square < num) {
            square ++;
            if (square * square == num) {
                System.out.println(num + "的平方根是" + square);
                break;
            } else if (square * square > num) {
                System.out.println(num + "的平方根是" + (square - 1));
                break;
            }
        }
    }
}
