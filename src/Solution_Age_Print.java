public class Solution_Age_Print {
    public static void main(String[] args) {
        int result = solution(40);
        System.out.println(result);
    }

    public static int solution(int age) {
        return 2022 - (age - 1);
    }
}
