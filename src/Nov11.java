import java.util.function.BiFunction;

/**
 * @auther ChenLei
 * @create 2020-11-4:03 PM
 */
public class Nov11 {
    public static void main(String[] args) {

        BiFunction<String, Integer, Apple> biFunction = Apple::new;
        Apple a1 = biFunction.apply("red", 50);
    }
}

