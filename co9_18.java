import java.util.ArrayList;

class Box<T> {
    ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Dharmik");
        stringBox.display();
        
        Box<Integer> intBox = new Box<>();
        intBox.addItem(101);
        intBox.display();
    }
}
