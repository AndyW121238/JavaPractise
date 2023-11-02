public class Homework05 {
    // 判断 101 - 200 之间有多少素数,并输出所有素数
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(i + "是质数");
            }
        }
        System.out.println("101 - 200之间有" + count + "个质数");
    }
}
