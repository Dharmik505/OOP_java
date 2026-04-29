import java.util.Scanner;

public class Time {
    int hours;
    int minutes;

    public void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    public void displayTime() {
        System.out.println(hours + ":" + minutes);
    }

    public void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours + (minutes / 60);
        minutes = minutes % 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        
        t1.setTime(sc.nextInt(), sc.nextInt());
        t2.setTime(sc.nextInt(), sc.nextInt());
        t3.addTime(t1, t2);
        t3.displayTime();
        sc.close();
    }
}
