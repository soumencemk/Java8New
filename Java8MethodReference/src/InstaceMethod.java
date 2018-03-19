/**
 * @author Soumen Karmakar
 * 3/12/2018
 */

public class InstaceMethod {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        InstaceMethod instaceMethod = new InstaceMethod();
        Sayable s1 = instaceMethod::saySomething;
        System.out.println(s1);

        Thread t = new Thread(instaceMethod::saySomething);
        t.run();
    }
}
