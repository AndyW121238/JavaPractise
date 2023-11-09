package Homework04;

public class Buyer extends AdminStuff{
    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("采购专员正在工作");
    }
}
