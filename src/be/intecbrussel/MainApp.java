package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {


        Kassa kassa = new Kassa();
        kassa.open();

        System.out.println("total price: " + kassa.calculateTotalPrice());
        System.out.println("shopping cart : " + kassa.getSoldproducts());






    }

}