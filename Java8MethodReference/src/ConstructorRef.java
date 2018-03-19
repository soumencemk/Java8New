/**
 * @author Soumen Karmakar
 * 3/12/2018
 */

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}

public class ConstructorRef {

    public static void main(String[] args) {
        Messageable ref = Message::new;
        ref.getMessage("SOMETHING");

    }
}
