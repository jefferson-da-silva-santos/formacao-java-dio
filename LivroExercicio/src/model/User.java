package model;

import java.util.UUID;

public class User {
    private final UUID id;
    private String name;
    private String address;
    private String phone;

    public User(String name, String address, String phone) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
