package callback;

import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        getName("Ram",
                null,
                fName -> System.out.println("last name null for -> " + fName)
        );
    }

    static void getName(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
