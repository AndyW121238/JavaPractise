public class Homework02 {
    // 把int数组中的数据转换成字符串返回
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String s = toString(arr);
        System.out.println(s);
    }

    public static String toString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int num:arr){
            sb.append(num);
        }
        sb.append("]");
        return sb.toString();
    }
}
