public class LaundryServiceTest {

    public static void main(String[] args) {

        double weight = 5.0;
        double pricePerKg = 50.0;

        double expectedPrice = 250.0;
        double actualPrice =
                LaundryService.calculatePrice(weight, pricePerKg);

        if (actualPrice == expectedPrice) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.out.println("Expected: " + expectedPrice);
            System.out.println("Actual: " + actualPrice);
        }
    }
}