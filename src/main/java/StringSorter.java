import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSorter implements Sortable<String> {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items);

    }

    public static void main(String[] args) {
        StringSorter sorter = new StringSorter();
        List<String> items = Arrays.asList("Banana","Apple","Cherry");
        sorter.sort(items);
        System.out.println(items);
    }
}
