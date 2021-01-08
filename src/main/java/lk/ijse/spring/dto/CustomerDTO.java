package lk.ijse.spring.dto;


import java.sql.Date;

public class CustomerDTO {
    private String nICNumber;
    private String name;
    private String address;
    private String email;
    private String password;
    private String comfirmPassword;
    private String nICImage;
    private String lICImage;
    private String lICNumber;
    private String contact;

    public CustomerDTO() {
    }

    public CustomerDTO(String nICNumber, String name, String address, String email, String password, String comfirmPassword, String nICImage, String lICImage, String lICNumber, String contact) {
        this.nICNumber = nICNumber;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.comfirmPassword = comfirmPassword;
        this.nICImage = nICImage;
        this.lICImage = lICImage;
        this.lICNumber = lICNumber;
        this.contact = contact;
    }

    public String getnICNumber() {
        return nICNumber;
    }

    public void setnICNumber(String nICNumber) {
        this.nICNumber = nICNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComfirmPassword() {
        return comfirmPassword;
    }

    public void setComfirmPassword(String comfirmPassword) {
        this.comfirmPassword = comfirmPassword;
    }

    public String getnICImage() {
        return nICImage;
    }

    public void setnICImage(String nICImage) {
        this.nICImage = nICImage;
    }

    public String getlICImage() {
        return lICImage;
    }

    public void setlICImage(String lICImage) {
        this.lICImage = lICImage;
    }

    public String getlICNumber() {
        return lICNumber;
    }

    public void setlICNumber(String lICNumber) {
        this.lICNumber = lICNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "nICNumber='" + nICNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", comfirmPassword='" + comfirmPassword + '\'' +
                ", nICImage='" + nICImage + '\'' +
                ", lICImage='" + lICImage + '\'' +
                ", lICNumber='" + lICNumber + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
