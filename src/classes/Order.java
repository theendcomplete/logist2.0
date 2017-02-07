package classes;


import java.util.Collection;
import java.util.Date;

public class Order {
    private Long order_ID;
    private String address;
    private String target;
    private Date startDate;
    private Date endDate;


    private TransportCompany transportCompany;


    private byte[] image;


    private User user;
    private Cargo cargo;
    private Contractor contractor;
    private Collection<Contact> contact;
    private classes.Driver Driver;
    private classes.Car Car;

    public Order() {
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Collection<Contact> getContact() {
        return contact;
    }

    public void setContact(Collection<Contact> contact) {
        this.contact = contact;
    }

    public classes.Driver getDriver() {
        return Driver;
    }

    public void setDriver(classes.Driver driver) {
        Driver = driver;
    }

    public classes.Car getCar() {
        return Car;
    }

    public void setCar(classes.Car car) {
        Car = car;
    }
}
