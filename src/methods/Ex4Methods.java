package methods;

import java.time.LocalDateTime;

public class Ex4Methods {
    public static void main(String[] args) {
        //Ex4. Scrie o metoda care returneaza ziua, data si ora la care programul a fost compilat.

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);

    }


}
