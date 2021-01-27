import java.util.stream.IntStream;

/**
 * @auther ChenLei
 * @create 2020-11-3:53 PM
 */
public class Nov12 {

    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 100).filter(num -> (num & 1) == 0
        /*{
//            System.out.println("2");
            return (num ^ 1) == 0;
        }*/);
        System.out.println("===================");
        System.out.println(intStream.count());
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println(evenNumbers.count());
    }
}
