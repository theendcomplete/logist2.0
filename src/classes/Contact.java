package classes;

import java.util.Collection;


public class Contact {
    private Long contact_ID;
    private String name;
    private String phone;
    private Collection<Order> Orders;

    public Contact() {

    }

    public Long getContact_ID() {
        return contact_ID;
    }

    public void setContact_ID(Long contact_ID) {
        this.contact_ID = contact_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Collection<Order> getOrders() {
        return Orders;
    }

    public void setOrders(Collection<Order> orders) {
        Orders = orders;
    }
}
