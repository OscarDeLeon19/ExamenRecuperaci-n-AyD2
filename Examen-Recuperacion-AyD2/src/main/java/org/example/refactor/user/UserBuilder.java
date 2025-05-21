package org.example.refactor.user;

/**
 * Esta clase es el builder de un usuario
 */
public class UserBuilder {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String zip;

    public UserBuilder() {}

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public User build() {
        return new User(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
