package declarative.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greet.accept(new Customer("Ram", 12345L));
        greet2.accept(new Customer("Sita", 987654L), false);
    }

    static Consumer<Customer> greet =
            customer -> System.out.println("Welcome, " + customer.getName() + " to phone number "
                    + customer.getPhoneNum());

    static BiConsumer<Customer, Boolean> greet2 =
            ((customer, showPhoneNum) -> System.out.println("Hello, " + customer.getName()
                    + ". Thanks for registering "
                    + (showPhoneNum ? customer.getPhoneNum() : "********")));

    static class Customer {
        private final String name;
        private final Long phoneNum;

        public Customer(String name, Long phoneNum) {
            this.name = name;
            this.phoneNum = phoneNum;
        }

        public String getName() {
            return name;
        }

        public Long getPhoneNum() {
            return phoneNum;
        }
    }
}
