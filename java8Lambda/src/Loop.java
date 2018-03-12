import java.util.ArrayList;
import java.util.List;

/**
 * @author Soumen Karmakar
 * 3/12/2018
 */
public class Loop {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n) -> sb.append(n+" ")
        );
        System.out.println(sb.toString());
    }
}
