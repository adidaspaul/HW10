import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Random {
    public static void main(String[] args) {
        System.out.println(random(6).limit(5).collect(Collectors.toList()));
    }

    static Stream<Long> random (long seed)  {
        long a = 25214903917l;
        long c = 11;
        long m = (long) Math.pow(2, 48);

        return myRandom(a, c, m, seed);
    }
    static Stream<Long> myRandom(long a, long c, long m, long seed){
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
