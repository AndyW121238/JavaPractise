public class Homework02 {
    // 定义一个方法判断数组中的某一个数是否存在,将结果返回给调用处
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 12, 56, 89, 34, 67};
        System.out.println(contain(numbers, 22));
        System.out.println(contain(numbers, 67));
    }

    public static boolean contain(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return true;
            }
        }
        return false;
    }
}
