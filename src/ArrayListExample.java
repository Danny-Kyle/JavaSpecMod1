import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String secondFruit = fruits.get(1);

        fruits.add(1, "blueberry");

        String res = fruits.getLast();
        System.out.println(res);

        fruits.set(2, "redberry");
        fruits.addFirst("soursop");

        for (String isaac : fruits) {
            System.out.println(isaac);
        }
    }
}
