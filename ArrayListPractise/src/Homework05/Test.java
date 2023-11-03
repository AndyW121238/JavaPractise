package Homework05;

import java.util.ArrayList;

public class Test {
    // 三个Phone对象分别为:
    // 小米, 1000. 苹果,8000. 锤子,2999
    // 定义一个方法,将价格低于3000的Phone信息返回
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();

        Phone mi = new Phone("小米", 1000);
        Phone apple = new Phone("苹果", 8000);
        Phone hammer = new Phone("锤子", 2999);

        phones.add(mi);
        phones.add(apple);
        phones.add(hammer);

        ArrayList<Phone> res = getPhones(phones);
        System.out.println(res);
    }

    public static ArrayList<Phone> getPhones (ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                result.add(list.get(i));
            }
        }
        return result;
    }

}
