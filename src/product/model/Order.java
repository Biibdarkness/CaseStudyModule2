package product.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private String name;
    private String phoneNumber;
    private String address;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(long id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Order(String record) {
        String [] fields = record.split(",");
        this.id = Long.parseLong(fields[0]);
        this.name = fields[1];
        this.phoneNumber = fields[2];
        this.address = fields[3];
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + phoneNumber + "," + address;
    }
}
