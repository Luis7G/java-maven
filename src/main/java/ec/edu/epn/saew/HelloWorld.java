package ec.edu.epn.saew;

import org.joda.time.DateTime;

public class HelloWorld {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println("dateTime: " + dateTime.plusDays(3).toLocalDate());
    }
}