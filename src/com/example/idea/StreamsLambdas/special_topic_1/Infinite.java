import java.util.stream.Stream;

import static com.example.idea.StreamsLambdas.producingStreams.Streams.show;

public class Infinite
{
   public static void main(String[] args)
   {
      Stream<Integer> ones = Stream.generate(() -> 1);
      show("An infinite stream of ones", ones);

      Stream<Integer> dieTosses =
         Stream.generate(() -> 1 + (int)(6 * Math.random()));
      show("An infinite stream of random numbers", dieTosses);

      Stream<Integer> integers = Stream.iterate(0, n -> n + 1);
      show("An infinite stream of integers", integers);

      integers = Stream.iterate(0, n -> n + 1);
      Stream<Integer> primes = integers.filter(n -> isPrime(n));
      show("An infinite stream of primes", primes);      
   }

   public static boolean isPrime(int number)
   {
      return Stream.iterate(1, n -> n + 1)
         .limit(number)
         .filter(n -> number % n == 0)
         .count() == 2;
   }

}
