class SumThread extends Thread {
    int start, end;
    long sum = 0;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println(t1.getSum() + t2.getSum());
    }
}
