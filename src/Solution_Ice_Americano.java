public class Solution_Ice_Americano {
    public static void main(String[] args) {
        int[] result = solution(15_000);
        System.out.println(result);
    }

    public static int[] solution(int money) {
        return new int[]{money / 5500, money%5500};
    }
}
