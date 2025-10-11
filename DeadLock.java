import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
   
}

class ThreadA extends Thread {
    Lock lock1, lock2;

    ThreadA(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        lock1.lock();
        System.out.println("Thread A locked first resource");
        try {
            Thread.sleep(1000); // hold lock1 while trying to acquire lock2
        } catch (InterruptedException e) {}

        lock2.lock();
        System.out.println("Thread A locked second resource");
        // Release locks (never reached due to deadlock)
        lock2.unlock();
        lock1.unlock();
    }
}

class ThreadB extends Thread {
    Lock lock1, lock2;

    ThreadB(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        lock2.lock();
        System.out.println("Thread B locked first resource");
        try {
            Thread.sleep(1000); // hold lock2 while trying to acquire lock1
        } catch (InterruptedException e) {}

        lock1.lock();
        System.out.println("Thread B locked second resource");
        // Release locks (never reached due to deadlock)
        lock1.unlock();
        lock2.unlock();
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        ThreadA t1 = new ThreadA(lock1, lock2);
        ThreadB t2 = new ThreadB(lock1, lock2);

        t1.start();
        t2.start();
    }
}