package optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println("null values found."));
    }
}
