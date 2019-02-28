package DTO;

import dk.webtrade.todelete.entity.Address;
import dk.webtrade.todelete.entity.Customer;

/**
 *
 * @author tha
 */
public class CustomerDTO {

    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
    private String address; //Changed type here from City(objekt) to String

    public CustomerDTO(Customer customer) {
        this.firstname = customer.getFirstname();
        this.lastname = customer.getLastname();
        this.age = customer.getAge();
        this.address = customer.getAddress().toString();
    }

    public CustomerDTO(String firstname, String lastname, int age, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address.toString();
    }

    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
