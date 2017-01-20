package classes;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
    private Long order_ID;
    private String address;
    private String target;
    private Date startDate;
    private Date endDate;
    private Contractor contractor;
    private User user;
    private Driver driver;
    private TransportCompany transportCompany;
    private byte[] image;
    private Contact contact;
    private Cargo cargo;
    private Set Orders = new HashSet();

    public Order() {
    }

    public Long getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(Long order_ID) {
        this.order_ID = order_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public TransportCompany getTransportCompany() {
        return transportCompany;
    }

    public void setTransportCompany(TransportCompany transportCompany) {
        this.transportCompany = transportCompany;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Set getOrders() {
        return Orders;
    }

    public void setOrders(Set orders) {
        Orders = orders;
    }
}
