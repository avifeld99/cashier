package be.intecbrussel;

import java.util.Scanner;

public class Kassa {

    Scanner myScanner = new Scanner(System.in);

        private int breadSold = 0;
        private int milkSold = 0;
        private int appleSold = 0;
        private int baguetteSold = 0;
        private int coffeeSold = 0;

        public Kassa () {

        }

        public void open() {
                while (true) {
                        System.out.print("please enter the product you want to buy: ");
                        String input = myScanner.next();

                        if(input.toLowerCase().equals("stop")) {
                                break;
                        }

                        productSold(input);
                }
        }



        public void productSold(String product) {
            switch (product.toLowerCase()) {
                case "bread":
                    if (breadSold <= 10) {
                        breadSold++;
                    } else {
                        System.out.println("product is unfortunately sold out");
                    }
                    break;
                case "milk":
                    if (milkSold <= 10) {
                        milkSold++;
                    } else {
                        System.out.println("product is unfortunately sold out");
                    }
                    break;
                case "apple":
                    if (appleSold <= 10) {
                        appleSold++;
                    } else {
                        System.out.println("product is unfortunately sold out");
                    }
                    break;
                case "baguette":
                    if (baguetteSold <= 10) {
                        baguetteSold++;
                    } else {
                        System.out.println("product is unfortunately sold out");
                    }
                    break;
                case "coffee":
                    if (coffeeSold <= 10) {
                        coffeeSold++;
                    } else {
                        System.out.println("product is unfortunately sold out");
                    }
                    break;
                default:
                    System.out.println("product sold out!");
            }
        }

        public double calculateTotalPrice() {
            double totalPrice = 0;

            totalPrice += 2.5 * breadSold;
            totalPrice += 1.25 * milkSold;
            totalPrice += 0.5 * appleSold;
            totalPrice += 0.75 * baguetteSold;
            totalPrice += 3 * coffeeSold;


            return totalPrice;
            //return (2.5 * breadSold) + (1.25 * milkSold) + ...;
        }

        public StringBuilder getSoldproducts() {
            StringBuilder productsSold = new StringBuilder();

            productsSold.append(" bread x " + breadSold + ",");
            productsSold.append(" milk x " + breadSold + ",");
            productsSold.append(" apple x " + breadSold + ",");
            productsSold.append(" baguette x " + breadSold + ",");
            productsSold.append(" coffee x " + breadSold);


            return productsSold;
        }
}
