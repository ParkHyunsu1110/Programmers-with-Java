public class Solution_Discount_For_Clothing_Store {
    public static void main(String[] args) {
        int result = solution(150_000);
        System.out.println(result);
    }

    public static int solution(int price) {
        double discount = 1.0;

        int pr = price / 10000;

        if (pr >= 50) discount = 0.8;
        else if (pr >= 30) discount = 0.9;
        else if (pr >= 10) discount = 0.95;
        return (int) (price * discount);
    }
}
