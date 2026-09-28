public class LaundryService {

    public static double calculatePrice(double weight, double pricePerKg) {
        return weight * pricePerKg;
    }

    public static void main(String[] args) {

        double weight = 5.0;
        double pricePerKg = 50.0;

        double totalPrice = calculatePrice(weight, pricePerKg);

        System.out.println("================================");
        System.out.println("   SMART LAUNDRY SERVICE");
        System.out.println("================================");
        System.out.println("Service       : Wash");
        System.out.println("Weight        : " + weight + " kg");
        System.out.println("Price per Kg  : Rs. " + pricePerKg);
        System.out.println("--------------------------------");
        System.out.println("Total Price   : Rs. " + totalPrice);
        System.out.println("Order Status  : Pending Pickup");
        System.out.println("================================");
    }
}