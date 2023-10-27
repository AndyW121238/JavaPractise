import java.util.Scanner;

public class Homework04 {
    // 机票价格按照淡季旺季、头等舱和经济舱收费,输入机票原价、月份和头等舱或经济舱.
    // 按照如下规则计算机票价格:旺季(5-10月)头等舱9折,经济舱8.5折,单机(11月到来年4月)头等舱7折,经济舱6.5折.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int originalPrice = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入头等舱还是经济舱(头等舱是1,经济舱是2):");
        int flightClass = sc.nextInt();
        int realPrice;
        if (month >= 5 && month <= 10) {
            if (flightClass == 1) {
                realPrice = (int) (originalPrice * 0.9);
            } else {
                realPrice = (int) (originalPrice * 0.85);
            }
        } else {
            if (flightClass == 1) {
                realPrice = (int) (originalPrice * 0.7);
            } else {
                realPrice = (int) (originalPrice * 0.65);
            }
        }
        System.out.println("机票价格为" + realPrice);
    }
}
