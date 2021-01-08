package lk.ijse.spring.entity;


import javax.persistence.*;

@Entity
public class Driver {
    @Id
    private String driver_NIC;
    private String driver_name;
    private String driver_Address;
    private String email;
    private int driver_contact;
    private boolean driver_Availability;
    private String driver_ShecduleDec;
    private String driver_password;

    public Driver() {
    }

    public Driver(String driver_NIC, String driver_name, String driver_Address, String email, int driver_contact, boolean driver_Availability, String driver_ShecduleDec, String driver_password) {
        this.driver_NIC = driver_NIC;
        this.driver_name = driver_name;
        this.driver_Address = driver_Address;
        this.email = email;
        this.driver_contact = driver_contact;
        this.driver_Availability = driver_Availability;
        this.driver_ShecduleDec = driver_ShecduleDec;
        this.driver_password = driver_password;
    }

    public String getDriver_NIC() {
        return driver_NIC;
    }

    public void setDriver_NIC(String driver_NIC) {
        this.driver_NIC = driver_NIC;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_Address() {
        return driver_Address;
    }

    public void setDriver_Address(String driver_Address) {
        this.driver_Address = driver_Address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDriver_contact() {
        return driver_contact;
    }

    public void setDriver_contact(int driver_contact) {
        this.driver_contact = driver_contact;
    }

    public boolean isDriver_Availability() {
        return driver_Availability;
    }

    public void setDriver_Availability(boolean driver_Availability) {
        this.driver_Availability = driver_Availability;
    }

    public String getDriver_ShecduleDec() {
        return driver_ShecduleDec;
    }

    public void setDriver_ShecduleDec(String driver_ShecduleDec) {
        this.driver_ShecduleDec = driver_ShecduleDec;
    }

    public String getDriver_password() {
        return driver_password;
    }

    public void setDriver_password(String driver_password) {
        this.driver_password = driver_password;
    }
}
