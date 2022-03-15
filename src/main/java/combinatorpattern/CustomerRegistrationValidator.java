package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid() {
        return customer -> customer.getPhoneNum().contains("00977") ? SUCCESS : PHONE_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now())
                .getYears() > 18
                ? SUCCESS : DOB_NOT_VALID;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult resul = this.apply(customer);
            return resul.equals(SUCCESS) ? other.apply(customer) : resul;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID,
        DOB_NOT_VALID,
    }
}
