package threads;

public class MyThread implements Runnable{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(this.getName()=="even"&&i%2==0)
                System.out.println(this.getName()+i);
            if(this.getName()=="odd"&&i%2==1)
                System.out.println(this.getName()+i);
        }
    }
}
