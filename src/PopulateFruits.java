import java.util.ArrayList;
import java.util.List;

public class PopulateFruits {
    List<Fruits> getFruitsList() {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Apple", "red"));
        fruits.add(new Fruits("Pineapple", "yellow"));
        fruits.add(new Fruits("Orange", "orange"));
        fruits.add(new Fruits("Banana", "yellow"));
        fruits.add(new Fruits("Cherry", "red"));
        fruits.add(new Fruits("apple", "red"));

        return fruits;
    }
}
