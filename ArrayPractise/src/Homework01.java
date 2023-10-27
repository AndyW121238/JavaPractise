public class Homework01 {
    // 已知数组元素为{33,5,22,44,55}
    // 请找出数组中的最大值并打印在控制台
    public static void main(String[] args) {
        int[] numbers = {33, 5, 22, 44, 55};
        int max = getMax(numbers);
        System.out.print("{");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println("}中最大的数是" + max);
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = numbers[i] > max ? numbers[i] : max;
        }
        return max;
    }
}
