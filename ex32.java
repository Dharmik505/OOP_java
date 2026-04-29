import java.util.*;

public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println(searchElement(intList, 2));

        LinkedList<String> strList = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println(searchElement(strList, "Z"));
    }
}
