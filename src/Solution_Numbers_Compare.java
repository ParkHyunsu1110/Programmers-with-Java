public class Solution_Numbers_Compare {
    public static void main(String[] args) {
        int result = solution(7, 7);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;
        return answer;
    }
}
