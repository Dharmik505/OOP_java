class Table {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class TableThread extends Thread {
    Table t;
    int num;
    public TableThread(Table t, int num) {
        this.t = t;
        this.num = num;
    }
    public void run() {
        t.printTable(num);
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Table obj = new Table();
        new TableThread(obj, 5).start();
        new TableThread(obj, 7).start();
    }
}
