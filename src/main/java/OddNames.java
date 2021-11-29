import java.util.*;
import java.util.stream.Collectors;

public class OddNames{
public static void main(String[] args){
    List<String> list = new ArrayList<>(Arrays.asList("Ivan", "Roman", "Alex", "Jones", "Travis", "Parker", "Thor"));
    String result = getOddNames(list);
    System.out.println(result);
}

public static String getOddNames(List<String> list){
    return list.stream()
    .filter(i -> list.indexOf(i) % 2 != 0)
    .map(x -> list.indexOf(x) + ". " + x)
    .collect(Collectors.joining(", "));
}

}

