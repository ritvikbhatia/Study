package threads;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable{
    Lock lock=new ReentrantLock();
    private String name;
    private  int count =0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        synchronized (this) {
            try {
                if(i==3)
                    wait();
                    Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            notifyAll();
            setCount(count + 1);
            System.out.println(Thread.currentThread().getName() +getCount());
            ;
        }
        }
    }
    }

