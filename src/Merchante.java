public class Merchante {
    private String name;
    private String birth;
    private int activeContracts;
    private double balance; // in a tons
    private String address;
    private String carID;
    private double carConsumption;

    public Merchante(String name, String birth, int activeContracts, double balance, String address, String carID, double carConsumption) {
        this.name = name;
        this.birth = birth;
        this.activeContracts = activeContracts;
        this.balance = balance;
        this.address = address;
        this.carID = carID;
        this.carConsumption = carConsumption;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public int getActiveContracts() {
        return activeContracts;
    }

    public double getBalance() {
        return balance;
    }

    public String getAddress() {
        return address;
    }

    public String getCarID() {
        return carID;
    }

    public double getCarConsumption() {
        return carConsumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setActiveContracts(int activeContracts) {
        this.activeContracts = activeContracts;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setCarConsumption(double carConsumption) {
        this.carConsumption = carConsumption;
    }
}