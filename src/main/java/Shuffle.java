import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Shuffle {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Ssad", "asdsa", "asd ");
        Stream<String> stream2 = Stream.of("223", null, "1234sasxc", "1212edfsacxc");

        System.out.println(zip(stream1, stream2).collect(Collectors.toList()));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iter1 = first.iterator();
        Iterator<T> iter2 = second.iterator();

        Stream<T> result = Stream.empty();

        while(iter1.hasNext() && iter2.hasNext()) {
            result = Stream.concat(result, Stream.of(iter1.next(), iter2.next()));
        }


        return result;
    }
}
