import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedArray {
    public static void main(String[] args) {
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};
        String result = numberSort(numbers);
        System.out.println(result);
    }

    public static String numberSort(String[] number) {
        return Arrays.stream(number)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}