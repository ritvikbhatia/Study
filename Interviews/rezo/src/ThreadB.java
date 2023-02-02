import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadB implements Runnable{
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        System.out.println("consuming");
        lock.unlock();
    }
}
