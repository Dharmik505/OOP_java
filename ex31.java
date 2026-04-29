import java.util.*;

public class Playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        
        list.add(sc.nextLine());
        list.add(sc.nextLine());
        list.add(sc.nextLine());
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
        sc.close();
    }
}
