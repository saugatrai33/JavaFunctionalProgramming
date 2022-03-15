package combinatorpattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String phoneNum;
    private final String email;
    private final LocalDate dob;

    public Customer(String name, String phoneNum, String email, LocalDate dob) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
