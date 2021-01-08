package lk.ijse.spring.dto;

public class MaintenanceCarDTO {

    private String mID;
    private String givenDate;
    private String maintenanceCarNumber;
    private String maintenanceCarDesc;

    public MaintenanceCarDTO() {
    }

    public MaintenanceCarDTO(String mID, String givenDate, String maintenanceCarNumber, String maintenanceCarDesc) {
        this.mID = mID;
        this.givenDate = givenDate;
        this.maintenanceCarNumber = maintenanceCarNumber;
        this.maintenanceCarDesc = maintenanceCarDesc;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(String givenDate) {
        this.givenDate = givenDate;
    }

    public String getMaintenanceCarNumber() {
        return maintenanceCarNumber;
    }

    public void setMaintenanceCarNumber(String maintenanceCarNumber) {
        this.maintenanceCarNumber = maintenanceCarNumber;
    }

    public String getMaintenanceCarDesc() {
        return maintenanceCarDesc;
    }

    public void setMaintenanceCarDesc(String maintenanceCarDesc) {
        this.maintenanceCarDesc = maintenanceCarDesc;
    }

    @Override
    public String toString() {
        return "MaintenanceCarDTO{" +
                "mID='" + mID + '\'' +
                ", givenDate='" + givenDate + '\'' +
                ", maintenanceCarNumber='" + maintenanceCarNumber + '\'' +
                ", maintenanceCarDesc='" + maintenanceCarDesc + '\'' +
                '}';
    }
}
