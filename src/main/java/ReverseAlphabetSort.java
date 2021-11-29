import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 public class ReverseAlphabetSort{
    public static void main(String[] args){
    List<String> list = new ArrayList<>(Arrays.asList("Ivor", "Norman", "Kate", "Johnson", "Moderna", "Bezos", "Peter", "Alex"));
    List<String> result = sortAlphabet(list);
    System.out.println(result);
    }

    public static List<String> sortAlphabet(List<String> list){
    return list.stream()
    .map(String::toUpperCase)
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
    }
}

