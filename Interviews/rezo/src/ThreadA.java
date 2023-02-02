import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadA implements Runnable{
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        System.out.println("producing");
        lock.unlock();
    }
}
