package classes;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TCs")
public class TransportCompany {
    private Long id;
    private String address;
    private String comment;
    private Set TransportCompanies = new HashSet();

    public TransportCompany() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set getTransportCompanies() {
        return TransportCompanies;
    }

    public void setTransportCompanies(Set transportCompanies) {
        TransportCompanies = transportCompanies;
    }
}
