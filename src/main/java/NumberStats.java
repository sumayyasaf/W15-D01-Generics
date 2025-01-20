import java.util.Arrays;
import java.util.List;

public class NumberStats<T extends Number> {
    public double calculateAverage(List<T> numbers){
        double sum = 0.0;
        //loop through the list and convert each number to a double using the doubleValue() method
        for (T number : numbers){
            sum += number.doubleValue();
        }
        return sum/numbers.size();
    }
    public T findMax(List<T> numbers){
        T max = numbers.get(0);
        for(T number : numbers){
        if(number.doubleValue() > max.doubleValue()){
            max = number;
        }

        }
        return max;
    }
    public static void printList(List<?> list){
        //treat each element as an Object since we don't have the Type.
        for(Object obj : list){
            System.out.println(obj);

        }
    }

    public static void main(String[] args) {
        NumberStats<Integer> stats = new NumberStats<>();
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println(stats.calculateAverage(numbers));
        System.out.println(stats.findMax(numbers));

       // ---------------->Task 3: Use Wildcards with Collections
        List<String> words =List.of("Hello", "Wildcard");
        List<Integer> num = List.of(1,2,3,4);
        printList(words);
        printList(num);
    }


}
