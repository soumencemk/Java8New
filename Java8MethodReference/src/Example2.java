import java.util.function.BiFunction;

/**
 * @author Soumen Karmakar
 * 3/12/2018
 */

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Example2 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        Integer apply = adder.apply(10, 20);
        System.out.println(apply);
    }


}
