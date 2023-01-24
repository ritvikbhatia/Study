public class Intanciator implements Runnable{
    @Override
    public void run() {
        SingletonClass singletonClass=SingletonClass.getInstance();
        System.out.println("from thread "+singletonClass.hashCode());
    }
}
