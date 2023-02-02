public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();
        Thread thread=new Thread(threadA);
        Thread thread2=new Thread(threadB);
        thread.start();
        thread2.start();

    }
}