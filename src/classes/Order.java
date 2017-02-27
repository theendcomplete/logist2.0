package classes;


import java.util.Date;

public class Order {
    private Long order_ID;
    private String address;
    private String target;
    private String comment;
    private Date startDate;
    private Date endDate;
    private TransportCompany transportCompany;
    private byte[] image;
    private User user;
    private String cargo;
    private String whom;
    private Contractor contractor;
    private classes.Driver Driver;
    private classes.Car Car;
    private classes.Contact Contact;

    public Order() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
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

//    public void setStartDate(String startDate) {
//
//        this.startDate = convertStringToDate(startDate);
//        //todo conversion
//        //28.02.2017, 11:31
//        //'DD.MM.YYYY, HH:mm'
//
//    }

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

    public classes.Contact getContact() {
        return Contact;
    }

    public void setContact(classes.Contact contact) {
        Contact = contact;
    }



}
