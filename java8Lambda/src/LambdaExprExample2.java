/**
 * @author Soumen Karmakar
 * 3/12/2018
 */
@FunctionalInterface
interface Sayable {
    public String say(String name);
}


interface SayableMulti {
    public String say(String name, String surName);
}

public class LambdaExprExample2 {

    public static void main(String[] args) {
        Sayable s = name -> {
            return "I am Saying :" + name;
        };

        System.out.println(s.say("Soumen"));

        SayableMulti sayableMulti = (name, surName) -> {
            return name + " " + surName;
        };
        System.out.println(sayableMulti.say("Soumen", "Karmakar"));
    }
}
