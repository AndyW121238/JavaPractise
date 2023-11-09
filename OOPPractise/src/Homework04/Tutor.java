package Homework04;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("助教正在辅助教学");
    }
}
