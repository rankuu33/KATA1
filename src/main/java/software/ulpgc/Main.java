package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Raúl", LocalDate.of(2003, 12,13));
        System.out.println(person);
    }
}
