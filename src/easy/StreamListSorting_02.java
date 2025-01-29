package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamListSorting_02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Ascending order  sorting");
        fruits.stream().sorted().forEach(System.out::println);

        System.out.println("Descending order sorting");
        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Another descening");
        fruits.stream().sorted((o2, o1) -> o1.compareTo(o2) ).forEach(System.out::println);



    }
}
