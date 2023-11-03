package Homework04;

import java.util.ArrayList;

public class Test1 {
    // main方法中定义一个集合,存入三个用户对象
    // 要求:定义一个方法,根据id查找对应用户信息
    // 如果存在,返回true
    // 如果不存在,返回false
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User(1, "王倪佳", "1023");
        User user2 = new User(2, "倪晨", "0304");
        User user3 = new User(3, "王芳", "1113");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("userList中是否含有id为5的用户对象:" + contains(userList,5));
        System.out.println("userList中是否含有id为1的用户对象:" + contains(userList,1));
        System.out.println("userList中是否含有id为3的用户对象:" + contains(userList,3));
    }

    public static boolean contains(ArrayList<User> list, int key){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == key){
                return true;
            }
        }
        return false;
    }
}
