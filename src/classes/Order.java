package classes;


import java.util.Date;

public class Order {
    private Long order_ID;
    private String address;
    private String target;
    private String comment;
    private Date startDate;
    private Date workDate;
    private Date endDate;
    private TransportCompany transportCompany;
    private byte[] image;
    private User user;
    private String cargo;
    private String status;
    private String whom;
    private String sum;

    private String dover;
    private String parking;
    private String heat;
    private String wepay;
    private String big;


    private Contractor contractor;
    private classes.Driver Driver;
    private classes.Car Car;
    private classes.Contact Contact;

    public Order() {
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getComment() {

        if (this.comment == null) {
            comment = "";
        }


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

    public String getDover() {
        return dover;
    }

    public void setDover(String dover) {


        if (this.dover == null) {
            dover = "";
        }

        this.dover = dover;
    }

    public String getParking() {


        if (this.parking == null) {
            parking = "";
        }

        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getHeat() {


        if (this.heat == null) {
            heat = "";
        }


        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getWepay() {
        return wepay;
    }

    public void setWepay(String wepay) {


        if (this.wepay == null) {
            wepay = "";
        }

        this.wepay = wepay;
    }

    public String getBig() {


        if (this.big == null) {
            big = "";
        }

        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
