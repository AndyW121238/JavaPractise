import java.util.Scanner;

public class Homework01 {
    // 如果x是一个回文整数,打印true,否则打印false
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        int reversed_x = 0;
        while (temp != 0) {
            int ge = temp % 10;
            reversed_x = reversed_x * 10 + ge;
            temp = temp / 10;
        }
        System.out.println(reversed_x == x);
    }
}
