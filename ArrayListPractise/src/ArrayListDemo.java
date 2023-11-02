import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1.创建集合
        // JDK7以前的写法
        //ArrayList<String> list = new ArrayList<String>();
        // JDK7以后的写法
        ArrayList<String> list = new ArrayList<>();
        // ArrayList在展示的时候会拿[]把数据包裹
        System.out.println(list); // 输出结果:[]

        // 2.添加元素
        // add()方法永远返回true
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        // 3.删除元素,删除成功返回true,删除失败返回false
        list.remove("aaa");
        System.out.println(list);

        // 4.按索引删除元素,返回删除的元素
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        // 5.修改元素,修改指定索引上的元素,返回被修改的值
        String replace = list.set(2, "ddd");
        System.out.println(replace);
        System.out.println(list);

        // 6.查询元素,返回指定索引上的元素
        String s = list.get(2);
        System.out.println(s);

        // 7.遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
