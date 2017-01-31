package classes;

import java.util.Collection;

public class Contractor {
    private Long contractor_ID;
    private String name;
    private String address;
    private String phone;
    //    private Set Contractors = new HashSet();
    private Collection<Order> orders;

    public Contractor() {
    }

    public Long getContractor_ID() {
        return contractor_ID;
    }

    public void setContractor_ID(Long contractor_ID) {
        this.contractor_ID = contractor_ID;
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

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
}
