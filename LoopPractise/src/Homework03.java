public class Homework03 {
    // 逢七过
    // 从任意一个数字开始报数,只要数字包含7或者是7的倍数时要跳过
    // 需求: 使用程序在控制台打印出1-100之间满足规则的数据
    public static void main(String[] args) {
       for(int i = 0; i <= 100; i++) {
           int ge = i % 10;
           int shi = i / 10 % 10;
           if(i % 7 == 0 || ge == 7 || shi == 7) {
               continue;
           }
           System.out.println(i);
       }
    }
}
