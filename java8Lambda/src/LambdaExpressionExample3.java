/**
 * @author Soumen Karmakar
 * 3/12/2018
 */

interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample3 {

    public static void main(String[] args) {
        // WIthout Return
        Addable ad1 = (a, b) -> (a + b);
        // With Return
        Addable ad2 = (a, b) -> {
            return (a + b);
        };
        System.out.println(ad1.add(1,2));
        System.out.println(ad2.add(1,2));
    }

}
