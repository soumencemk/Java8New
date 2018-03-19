import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Soumen Karmakar
 * 3/19/2018
 */
public class NewDateTimeAPI {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
    }
}
