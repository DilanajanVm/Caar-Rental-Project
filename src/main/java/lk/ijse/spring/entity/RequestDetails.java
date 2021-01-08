package lk.ijse.spring.entity;


import javax.persistence.*;

@Entity
public class RequestDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int requestID;
    private String requestedDate;
    private String customerName;
    private String customerContact;
    private String requestPickUpDate;
    private String requestDropOffDate;
    private String requestLocationFrom;
    private String requestLocationTo;
    private int requestPassenger;
    private String requestDriverStatus;
    private String requestDriverID;
    private String requestCarID;
    private String requestCarName;
    private double rentPriceForDate;
    private String chitIMG;
    private double requestAstimateTotal;
    private boolean requestStatus;

//    @OneToOne(mappedBy = "rDetails")
//    private Payment abc;


    public RequestDetails() {
    }

    public RequestDetails(int requestID, String requestedDate, String customerName, String customerContact, String requestPickUpDate, String requestDropOffDate, String requestLocationFrom, String requestLocationTo, int requestPassenger, String requestDriverStatus, String requestDriverID, String requestCarID, String requestCarName, double rentPriceForDate, String chitIMG, double requestAstimateTotal, boolean requestStatus) {
        this.requestID = requestID;
        this.requestedDate = requestedDate;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.requestPickUpDate = requestPickUpDate;
        this.requestDropOffDate = requestDropOffDate;
        this.requestLocationFrom = requestLocationFrom;
        this.requestLocationTo = requestLocationTo;
        this.requestPassenger = requestPassenger;
        this.requestDriverStatus = requestDriverStatus;
        this.requestDriverID = requestDriverID;
        this.requestCarID = requestCarID;
        this.requestCarName = requestCarName;
        this.rentPriceForDate = rentPriceForDate;
        this.chitIMG = chitIMG;
        this.requestAstimateTotal = requestAstimateTotal;
        this.requestStatus = requestStatus;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getRequestPickUpDate() {
        return requestPickUpDate;
    }

    public void setRequestPickUpDate(String requestPickUpDate) {
        this.requestPickUpDate = requestPickUpDate;
    }

    public String getRequestDropOffDate() {
        return requestDropOffDate;
    }

    public void setRequestDropOffDate(String requestDropOffDate) {
        this.requestDropOffDate = requestDropOffDate;
    }

    public String getRequestLocationFrom() {
        return requestLocationFrom;
    }

    public void setRequestLocationFrom(String requestLocationFrom) {
        this.requestLocationFrom = requestLocationFrom;
    }

    public String getRequestLocationTo() {
        return requestLocationTo;
    }

    public void setRequestLocationTo(String requestLocationTo) {
        this.requestLocationTo = requestLocationTo;
    }

    public int getRequestPassenger() {
        return requestPassenger;
    }

    public void setRequestPassenger(int requestPassenger) {
        this.requestPassenger = requestPassenger;
    }

    public String getRequestDriverStatus() {
        return requestDriverStatus;
    }

    public void setRequestDriverStatus(String requestDriverStatus) {
        this.requestDriverStatus = requestDriverStatus;
    }

    public String getRequestDriverID() {
        return requestDriverID;
    }

    public void setRequestDriverID(String requestDriverID) {
        this.requestDriverID = requestDriverID;
    }

    public String getRequestCarID() {
        return requestCarID;
    }

    public void setRequestCarID(String requestCarID) {
        this.requestCarID = requestCarID;
    }

    public String getRequestCarName() {
        return requestCarName;
    }

    public void setRequestCarName(String requestCarName) {
        this.requestCarName = requestCarName;
    }

    public double getRentPriceForDate() {
        return rentPriceForDate;
    }

    public void setRentPriceForDate(double rentPriceForDate) {
        this.rentPriceForDate = rentPriceForDate;
    }

    public String getChitIMG() {
        return chitIMG;
    }

    public void setChitIMG(String chitIMG) {
        this.chitIMG = chitIMG;
    }

    public double getRequestAstimateTotal() {
        return requestAstimateTotal;
    }

    public void setRequestAstimateTotal(double requestAstimateTotal) {
        this.requestAstimateTotal = requestAstimateTotal;
    }

    public boolean isRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(boolean requestStatus) {
        this.requestStatus = requestStatus;
    }
}
