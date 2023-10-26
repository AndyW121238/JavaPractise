import java.util.Random;
import java.util.Scanner;

public class Homework06 {
    // 猜数字小游戏
    // 系统自动生成1-100的随机数,猜出这个数字
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(101) + 1;
        while(true){
            int guessNumber = sc.nextInt();
            if (guessNumber < num) {
                System.out.println("猜小了!");
            }else if(guessNumber > num) {
                System.out.println("猜大了!");
            }else{
                System.out.println("猜对了!这个随机数是" + guessNumber);
                break;
            }
        }
    }
}
