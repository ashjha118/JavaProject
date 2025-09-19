package WeekFirst;

public class college_fees {
    public static void main(String[] args) {
        double college_fees = 125000;
        double discount = 10;

        double discountAmount = (discount * college_fees) / 100;
        double discountedPrice = college_fees - discountAmount;

        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedPrice);
    }
}
