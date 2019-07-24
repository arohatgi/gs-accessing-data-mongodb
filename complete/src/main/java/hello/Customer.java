package hello;

import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    public String id;

    private String firstName;
    private String lastName;
    private String address;

    public Customer() {}

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', address='%s']",
                id, firstName, lastName, address);
    }

}

