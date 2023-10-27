public class Homework03 {
    // 定义一个方法copyOfRange(int[] arr, int from, int to)
    // 将数组arr从索引from(包括from)开始,
    // 到索引to结束(不包含to)的元素复制到新数组中去
    // 将新数组返回
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArr = copyOfRange(arr, 0, 5);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index ++;
        }
        return newArr;
    }
}
