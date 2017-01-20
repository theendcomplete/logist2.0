package classes;

import java.util.HashSet;
import java.util.Set;

public class TransportCompany {
    private Long tc_ID;
    private String address;
    private String comment;
    private String name;
    private String phone;
    private Set TransportCompanies = new HashSet();

    public TransportCompany() {
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

    public Set getTransportCompanies() {
        return TransportCompanies;
    }

    public void setTransportCompanies(Set transportCompanies) {
        TransportCompanies = transportCompanies;
    }
}
