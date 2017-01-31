package classes;

public class TransportCompany {
    private Long tc_ID;
    private String address;
    private String comment;
    private String name;
    private String phone;
    private Order orders;


    public TransportCompany() {
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;

    }

    public Long getTc_ID() {
        return tc_ID;
    }

    public void setTc_ID(Long tc_ID) {
        this.tc_ID = tc_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
}
