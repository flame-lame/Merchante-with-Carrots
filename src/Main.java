public class Main {
    public static void main(String[] args) {

        Merchante sellerFirst = new Merchante("Piotr", "03-11-1985", 11, 8.3, "Střemy", "6Z5 3250", 6.3);
        Merchante sellerSecond = new Merchante("Vivor", "02-12-1982", 22, 12.3, "Solenice", "2B2 7227", 11.3);

        System.out.println();
        System.out.println("Name: " + sellerFirst.getName() + " # " + "Birth: " + sellerFirst.getBirth() + " # " + "ActiveContracts: " + sellerFirst.getActiveContracts() + " # " + "Balance: " + sellerFirst.getBalance() + " # " + "Adress: " + sellerFirst.getAddress() + " # " + "CarID: " + sellerFirst.getCarID() + " # " + "CarConsumption: " + sellerFirst.getCarConsumption());

        System.out.println();
        System.out.println("Name: " + sellerSecond.getName() + " # " + "Birth: " + sellerSecond.getBirth() + " # " + "ActiveContracts: " + sellerSecond.getActiveContracts() + " # " + "Balance: " + sellerSecond.getBalance() + " # " + "Adress: " + sellerSecond.getAddress() + " # " + "CarID: " + sellerSecond.getCarID() + " # " + "CarConsumption: " + sellerSecond.getCarConsumption());
    }
}