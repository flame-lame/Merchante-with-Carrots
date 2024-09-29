import java.time.LocalDate;

public class Merchante {
    private String name;
    private LocalDate birth;
    private int activeContracts;
    private double balance; // in a tons
    private String address;
    private String carID;
    private double carConsumption;

    public Merchante(String name, LocalDate birth, int activeContracts, double balance, String address, String carID, double carConsumption) {
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

    public LocalDate getBirth() {
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
}