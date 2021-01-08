package lk.ijse.spring.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarDetails {
    @Id
    private String carNumber;
    private String carModel;
    private String carType;
    private String carImg01;
    private String carImg02;
    private String carImg03;
    private String carImg04;
    private String carTransmissionType;
    private String carFuelType;
    private String carColor;
    private boolean carAvailerlibilty;
    private int passenger;
    private double carDailyRate;
    private double carMonthlyRate;
    private double carFreeKmForADay;
    private double carFreeKmForAMonth;
    private double carPriceForExtraKM;

    public CarDetails() {
    }

    public CarDetails(String carNumber, String carModel, String carType, String carImg01, String carImg02, String carImg03, String carImg04, String carTransmissionType, String carFuelType, String carColor, boolean carAvailerlibilty, int passenger, double carDailyRate, double carMonthlyRate, double carFreeKmForADay, double carFreeKmForAMonth, double carPriceForExtraKM) {
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carType = carType;
        this.carImg01 = carImg01;
        this.carImg02 = carImg02;
        this.carImg03 = carImg03;
        this.carImg04 = carImg04;
        this.carTransmissionType = carTransmissionType;
        this.carFuelType = carFuelType;
        this.carColor = carColor;
        this.carAvailerlibilty = carAvailerlibilty;
        this.passenger = passenger;
        this.carDailyRate = carDailyRate;
        this.carMonthlyRate = carMonthlyRate;
        this.carFreeKmForADay = carFreeKmForADay;
        this.carFreeKmForAMonth = carFreeKmForAMonth;
        this.carPriceForExtraKM = carPriceForExtraKM;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarImg01() {
        return carImg01;
    }

    public void setCarImg01(String carImg01) {
        this.carImg01 = carImg01;
    }

    public String getCarImg02() {
        return carImg02;
    }

    public void setCarImg02(String carImg02) {
        this.carImg02 = carImg02;
    }

    public String getCarImg03() {
        return carImg03;
    }

    public void setCarImg03(String carImg03) {
        this.carImg03 = carImg03;
    }

    public String getCarImg04() {
        return carImg04;
    }

    public void setCarImg04(String carImg04) {
        this.carImg04 = carImg04;
    }

    public String getCarTransmissionType() {
        return carTransmissionType;
    }

    public void setCarTransmissionType(String carTransmissionType) {
        this.carTransmissionType = carTransmissionType;
    }

    public String getCarFuelType() {
        return carFuelType;
    }

    public void setCarFuelType(String carFuelType) {
        this.carFuelType = carFuelType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public boolean isCarAvailerlibilty() {
        return carAvailerlibilty;
    }

    public void setCarAvailerlibilty(boolean carAvailerlibilty) {
        this.carAvailerlibilty = carAvailerlibilty;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public double getCarDailyRate() {
        return carDailyRate;
    }

    public void setCarDailyRate(double carDailyRate) {
        this.carDailyRate = carDailyRate;
    }

    public double getCarMonthlyRate() {
        return carMonthlyRate;
    }

    public void setCarMonthlyRate(double carMonthlyRate) {
        this.carMonthlyRate = carMonthlyRate;
    }

    public double getCarFreeKmForADay() {
        return carFreeKmForADay;
    }

    public void setCarFreeKmForADay(double carFreeKmForADay) {
        this.carFreeKmForADay = carFreeKmForADay;
    }

    public double getCarFreeKmForAMonth() {
        return carFreeKmForAMonth;
    }

    public void setCarFreeKmForAMonth(double carFreeKmForAMonth) {
        this.carFreeKmForAMonth = carFreeKmForAMonth;
    }

    public double getCarPriceForExtraKM() {
        return carPriceForExtraKM;
    }

    public void setCarPriceForExtraKM(double carPriceForExtraKM) {
        this.carPriceForExtraKM = carPriceForExtraKM;
    }
}
