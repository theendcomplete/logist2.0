package classes;

import java.util.HashSet;
import java.util.Set;


public class Contact {
    private Long contact_ID;
    private String name;
    private String phone;
    private Set Contacts = new HashSet();

    public Contact() {

    }

    public Long getContact_ID() {
        return contact_ID;
    }

    public void setContact_ID(Long contact_ID) {
        this.contact_ID = contact_ID;
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
