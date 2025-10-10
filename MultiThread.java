class Count {
    int count = 0;
    synchronized void CountIncreament() {
        count++;
        System.out.println(Thread.currentThread().getName());
    }
}

class CountThread extends Thread{
    Count counter;
    CountThread(Count counter) {
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.CountIncreament();
        }
    } 

}
class MainClass {
    public static void main(String[] args) {
        Count count = new Count();
        CountThread t1 = new CountThread(count);
        CountThread t2 = new CountThread(count);
        t1.start();
        t2.start();

        try {
        t1.join();
        t2.join();
        } 
        catch (Exception e) {
        }
        System.out.println("completed..."+count.count);
    }
}
