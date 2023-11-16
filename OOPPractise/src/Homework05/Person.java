package Homework05;

public class Person {
    public String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a,String something){
        if(a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的狗");
            d.eat(something);
        }
        else if(a instanceof Cat d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的猫");
            d.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }
}
