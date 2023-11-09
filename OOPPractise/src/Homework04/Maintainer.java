package Homework04;

public class Maintainer extends AdminStuff{
    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("维护专员在工作");
    }
}
