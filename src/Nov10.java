import javax.annotation.processing.Filer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Filter;

/**
 * @auther ChenLei
 * @create 2020-11-3:07 PM
 */
public class Nov10 {

    public static List<Apple> filterApple(List<Apple> appleList, Predicate<Apple> p) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        String[] colors = new String[]{"yellow", "blue", "brown", "red"};
        for (int i = 0; i < 10; ++i) {
            double random = Math.random();
            appleList.add(new Apple(colors[(int) (random * colors.length)], i * 10));
        }
        List<Apple> apples = filterApple(appleList, (Apple a) -> "brown".equals(a.getColor()));
        for (Apple apple : apples) {
            System.out.println(apple.getHeavy());
        }

    }
}

class Apple {

    private String color;
    private int heavy;

    public Apple(String color, int heavy) {
        this.color = color;
        this.heavy = heavy;
    }

    public String getColor() {
        return color;
    }

    public int getHeavy() {
        return heavy;
    }
}
