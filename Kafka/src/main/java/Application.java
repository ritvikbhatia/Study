import threads.MyThread;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        MyThread firstThread=new MyThread();
        firstThread.setName("even");
        MyThread secondThread=new MyThread();
        secondThread.setName("odd");
        Thread t1=new Thread(firstThread);
        Thread t2=new Thread(secondThread);
        t1.start();
        t2.start();
        System.out.println("awesome");
    }
}
