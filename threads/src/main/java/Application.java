import threads.MyThread;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        MyThread resource=new MyThread();
        Thread t1=new Thread(resource);
        Thread t2=new Thread(resource);
        t1.start();
        t2.start();
        System.out.println("awesome");
    }
}
