package org.example.refactor.user;

public class User {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String zip;

    /**
     * Usamos el patron builder para crear usuarios
     * @param builder
     */
    User(UserBuilder builder) {
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
        this.city = builder.getCity();
        this.zip = builder.getZip();
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}
