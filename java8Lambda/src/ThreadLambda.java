/**
 * @author Soumen Karmakar
 * 3/12/2018
 */
public class ThreadLambda {
    public static void main(String[] args) {
        // WIthout lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is Running");
            }
        };
        Thread t = new Thread(r1);
        t.run();

        // lambda

        Runnable r2 = () -> {
            System.out.println("Lambda Thread is Running");
        };

        Thread t1 = new Thread(r2);
        t1.run();

    }
}
