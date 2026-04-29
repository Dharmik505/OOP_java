import java.util.*;

public class SortDemo {
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 4, 2));
        System.out.println(nums);
        sortList(nums);
        System.out.println(nums);
        
        List<String> names = new ArrayList<>(Arrays.asList("Zebra", "Apple"));
        System.out.println(names);
        sortList(names);
        System.out.println(names);
    }
}
