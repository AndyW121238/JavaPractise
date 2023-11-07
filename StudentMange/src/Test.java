import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;
        boolean loginFlag = false;
        ArrayList<Student> stuList = new ArrayList<>();
        ArrayList<User> usersList = new ArrayList<>();

        do {
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("请输入您的选择:");
            choice = sc.next();
            switch (choice) {
                case "1" -> register(usersList);
                case "2" -> {
                    login(usersList);
                    loginFlag = true;
                }
                case "3" -> forgetPassword(usersList);
                case "4" -> {
                    System.out.println("已退出系统");
                    return;
                }
                default -> System.out.println("请输入有效的选择!");
            }
        } while (!loginFlag);

        do {
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择:");

            choice = sc.next();

            switch (choice) {
                case "1" -> addStudent(stuList);
                case "2" -> removeStudent(stuList);
                case "3" -> alterStudent(stuList);
                case "4" -> searchStudent(stuList);
                case "5" -> System.out.println("已退出系统");
                default -> System.out.println("请输入有效的选择!");
            }
        } while (!choice.equals("5"));
    }

    // 用户注册
    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        String name = null;
        // 检验用户名
        while (true) {
            System.out.println("请输入用户名:");
            name = sc.next();
            boolean flag1 = checkUsername(name);
            if (!flag1) {
                System.out.println("输入的用户名不符合规范,请重新输入!");
                continue;
            }
            boolean flag2 = contains(list, name);
            if (flag2) {
                System.out.println("用户名" + name + "已经存在,请重新输入!");
            } else {
                break;
            }
        }

        String password = null;
        String againPassword = null;
        // 检验密码
        while (true) {
            System.out.println("请输入密码:");
            password = sc.next();
            System.out.println("请再次输入密码:");
            againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码不一致,请重新输入!");
            } else {
                break;
            }
        }

        String id = null;
        // 验证身份证号码
        while (true) {
            System.out.println("请输入身份证号码:");
            id = sc.next();
            boolean flag = checkId(id);
            if (flag) {
                break;
            } else {
                System.out.println("输入的身份证号有误,请重新输入!");
            }
        }

        String phoneNumber = null;
        // 验证手机号码
        while (true) {
            System.out.println("请输入手机号码:");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                break;
            } else {
                System.out.println("输入的手机号码有误,请重新输入!");
            }
        }
        User user = new User(name, password, id, phoneNumber);
        list.add(user);
    }

    // 检验手机号码
    private static boolean checkPhoneNumber(String phoneNumber) {
        // 长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        // 不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }

        // 必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // 验证id的格式
    private static boolean checkId(String id) {
        // 长度为18
        if (id.length() != 18) {
            return false;
        }
        // 不能以0开头
        if (id.startsWith("0")) {
            return false;
        }
        // 前17位必须是数字
        for (int i = 0; i < id.length() - 1; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                return false;
            }
        }
        // 最后一位是数字或者x或者X
        char c = id.charAt(id.length() - 1);
        return (c >= '0' && c <= '9') || c == 'x' || c == 'X';
    }

    // 检测username中是否有user对象含有值与name相同而name属性
    private static boolean contains(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // 验证用户输入的用户名是否合法
    private static boolean checkUsername(String name) {
        // 用户名长度必须在3~15位之间
        int len = name.length();
        if (len < 3 || len > 15) {
            return false;
        }
        // 只能是字母加数字的组合,且不能是纯数字
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    // 用户登录
    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        String name;
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.println("请输入用户名:");
                name = sc.next();
                boolean flag1 = checkUsername(name);
                if (flag1) {
                    break;
                } else {
                    System.out.println("输入的用户名不符合规范,请重新输入!");
                }
            }
            boolean flag2 = contains(list, name);
            if (!flag2) {
                System.out.println("用户名" + name + "未注册,请先注册!");
                return;
            }

            System.out.println("请输入密码:");
            String password = sc.next();

            // 输入验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("正确的验证码为:" + rightCode);
                System.out.println("请输入验证码:");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确!");
                    break;
                } else {
                    System.out.println("验证码错误");
                }
            }

            User userInfo = new User(name, password, null, null);
            // 验证用户名与密码是否正确
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功,可以使用学生管理系统了!");
                break;
            } else {
                if (i == 2) {
                    System.out.println("当前账号" + name + "被锁定,请联系管理员!");
                    return;
                } else {
                    System.out.println("登录失败,用户名或密码错误!还剩下" + (2 - i) + "次机会!");
                }
            }
        }
    }

    // 验证用户名与没密码是否匹配的上
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (User user : list) {
            if (user.getUserName().equals(userInfo.getUserName()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // 生成验证码
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        // 随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());

            char c = list.get(index);
            sb.append(c);
        }

        // 随机数字
        int number = r.nextInt(10);
        sb.append(number);
        char[] chars = sb.toString().toCharArray();

        // 把字符串打乱
        int randomIndex = r.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        return new String(chars);
    }

    // 忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        String name;
        while (true) {
            System.out.println("请输入用户名:");
            name = sc.next();
            if(!checkUsername(name)){
                System.out.println("输入的用户名不符合规范,请重新输入!");
            } else {
                break;
            }
        }
        if(!contains(list,name)){
            System.out.println("当前用户" + name + "未注册,请先注册!");
            return;
        }

        // 录入身份证号码
        String id;
        while(true) {
            System.out.println("请输入身份证号码:");
            id = sc.next();
            if(!checkId(id)){
                System.out.println("输入的身份证号码格式有误,请重新输入:");
            }else {
                break;
            }
        }

        // 录入手机号码
        String phoneUmber;
        while(true) {
            System.out.println("请输入手机号码:");
            phoneUmber = sc.next();
            if(!checkPhoneNumber(phoneUmber)){
                System.out.println("输入的手机号码格式有误,请重新输入:");
            }else {
                break;
            }
        }

        // 比较用户的手机号码与身份证号码是否相同
        int index = findIndex(list,name);
        User user = list.get(index);
        if(!(user.getId().equalsIgnoreCase(id) && user.getPhoneNumber().equals(phoneUmber))){
            System.out.println("身份证号码或者手机号码输入有错误,不能修改密码!");
            return;
        }

        // 修改密码
        String password;
        while (true) {
            System.out.println("请输入新的密码:");
            password = sc.next();
            System.out.println("请再次输入新的密码:");
            String againPassword = sc.next();
            if(password.equals(againPassword)){
                System.out.println("两次密码一致,修改密码成功!");
                break;
            }else {
                System.out.println("两次密码不一致,请重新输入!");
            }
        }

        // 直接修改
        user.setPassword(password);
    }

    private static int findIndex(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            String userName = list.get(i).getUserName();
            if(userName.equals(name)){
                return i;
            }
        }
        return -1;
    }

    // 添加学生到学生集合中,id不能重复
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        int id;
        do {
            System.out.println("请输入学生的id:");
            id = sc.nextInt();
            if (studentContains(list, id)) {
                System.out.println("该id已被占用,请重新输入!");
            }
        } while (studentContains(list, id));
        s.setId(id);

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的地址:");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
    }

    // 根据学生id从学生集合中删除对应学生
    public static Student removeStudent(ArrayList<Student> list) {
        // 学生集合为空
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return null;
        }
        // 学生集合不为空
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生id:");
        int key = sc.nextInt();
        int index = getIndexOfStudent(list, key);
        if (index == -1) {
            System.out.println("没有查找相应学生,请重新输入!");
            return null;
        }

        Student s = list.get(index);
        list.remove(index);
        System.out.println("id为:" + key + "的学生对象已成功删除");
        return s;
    }

    // 根据id修改对应学生对象的信息
    public static void alterStudent(ArrayList<Student> list) {
        // 学生集合中没有数据
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return;
        }
        // 学生集合中有数据
        Scanner sc = new Scanner(System.in);

        int key;
        System.out.println("请输入要求改的学生id:");
        key = sc.nextInt();
        if (!studentContains(list, key)) {
            System.out.println("没有查找相应学生,请重新输入!");
            return;
        }
        int index = getIndexOfStudent(list, key);
        System.out.println("请输入修改后的姓名:");
        String name = sc.next();
        list.get(index).setName(name);
        System.out.println("请输入修改后的年龄:");
        int age = sc.nextInt();
        list.get(index).setAge(age);
        System.out.println("请输入修改后的地址:");
        String address = sc.next();
        list.get(index).setAddress(address);
        System.out.println("id为:" + key + "的学生信息修改成功!");
    }

    // 显示学生集合的全部信息
    public static void searchStudent(ArrayList<Student> list) {
        // 学生集合中没有数据
        if (list.size() == 0) {
            System.out.println("当前系统中没有学生信息,请添加后再试!");
            return;
        }

        // 学生集合中有数据
        System.out.print("id\t\t");
        System.out.print("姓名\t\t");
        System.out.print("年龄\t\t");
        System.out.print("地址");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.print(s.getId() + "\t\t");
            System.out.print(s.getName() + "\t");
            System.out.print(s.getAge() + "\t\t");
            System.out.print(s.getAddress() + "");
            System.out.println();
        }
    }

    // 根据id查询寻学生对象在学生集合中的索引,如果查询到则返回索引,没查找到返回-1
    public static int getIndexOfStudent(ArrayList<Student> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (key == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    // id是否已存在
    public static boolean studentContains(ArrayList<Student> list, int key) {
        return getIndexOfStudent(list, key) != -1;
    }
}
