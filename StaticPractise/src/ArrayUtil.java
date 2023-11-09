import com.sun.source.tree.ReturnTree;

import java.util.StringJoiner;

public class ArrayUtil {
    // 定义数组的工具类
    // 提供一个工具类方法printArr,用于返回整数数组的内容
    //    返回的字符串格式如:[10, 20, 50, 100](只考虑整数数组,且只考虑一维数组)
    // 提供一个工具类方法getAverage,用于返回平均分.(只考虑浮点数数组,且只考虑一维数组)
    // 定义一个测试类TestDemo,调用该工具类的工具方法,并返回结果

    // 私有化构造方法,外界无法创建其对象
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                sb.append(arr[i] + ", ");
            }else {
                sb.append(arr[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
