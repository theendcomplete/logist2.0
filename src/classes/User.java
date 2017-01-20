package classes;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Long user_ID;
    private String name;
    private String login;
    private String phone;
    private String password;
    private String pin;
    private String type;
    private Set Users = new HashSet();

    public User() {
    }

    public Long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Long user_ID) {
        this.user_ID = user_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set getUsers() {
        return Users;
    }

    public void setUsers(Set users) {
        Users = users;
    }
}
