package Homework04;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("讲师正在讲课");
    }
}
