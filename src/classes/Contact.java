package classes;

import java.util.HashSet;
import java.util.Set;


public class Contact {
    private Long id;
    private String name;
    private String phone;
    private Set Contacts = new HashSet();

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set getContacts() {
        return Contacts;
    }

    public void setContacts(Set contacts) {
        Contacts = contacts;
    }
}
