package Homework01;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙", 1);
        frog.eat();
        frog.drink();


        Dog dog = new Dog("狗", 2);
        dog.eat();
        dog.drink();


        Sheep sheep = new Sheep("羊", 4);
        sheep.eat();
        sheep.drink();
    }
}
