package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MaintenanceCar {
    @Id
    private String mID;
    private String givenDate;
    private String maintenanceCarNumber;
    private String maintenanceCarDesc;

    public MaintenanceCar() {
    }

    public MaintenanceCar(String mID, String givenDate, String maintenanceCarNumber, String maintenanceCarDesc) {
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


}
