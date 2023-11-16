package Homework01;

public class Dog extends Creature{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "吃骨头");
    }
}
