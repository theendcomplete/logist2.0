package classes;

import java.util.HashSet;
import java.util.Set;

public class Contractor {
    private Long contractor_ID;
    private String name;
    private String address;
    private String phone;
    private Set Contractors = new HashSet();

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

    public Set getContractors() {
        return Contractors;
    }

    public void setContractors(Set contractors) {
        Contractors = contractors;
    }
}
