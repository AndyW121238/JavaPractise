package Homework01;

public class Frog extends Creature{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "吃虫子");
    }

}
