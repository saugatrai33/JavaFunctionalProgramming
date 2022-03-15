package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        var customer = new Customer(
                "Ram",
                "00977989898",
                "ram@gmail.com",
                LocalDate.of(2001, 2, 14)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult())
                .apply(customer);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalAccessException(result.name());
        }
        System.out.println(result);
    }
}
