package Homework05;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog d = new Dog(2,"黑色");
        p.keepPet(d,"骨头");

        Cat c = new Cat(3,"白色");
        p.keepPet(c,"猫粮");
    }
}
