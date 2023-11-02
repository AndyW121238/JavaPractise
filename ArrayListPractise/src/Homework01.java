import java.util.ArrayList;

public class Homework01 {
    // 定义一个集合,添加字符串,并进行遍历
    // 遍历格式参照:[元素1,元素2,元素3]
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + ",");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.print("]");
    }
}
