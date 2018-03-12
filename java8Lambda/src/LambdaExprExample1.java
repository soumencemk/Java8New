/**
 * @author Soumen Karmakar
 * 3/12/2018
 */

interface Drawable {
    public void draw();
}

public class LambdaExprExample1 {

    public static void main(String[] args) {
        int width = 100;
        Drawable d1 = () -> {
            System.out.println("Drawing with Width - " + width);
        };
        d1.draw();
    }
}
