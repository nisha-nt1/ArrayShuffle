import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        
        // Shuffle the list
        Collections.shuffle(list);
        
        System.out.println("Shuffled array: " + Arrays.toString(list.toArray()));
    }
}
