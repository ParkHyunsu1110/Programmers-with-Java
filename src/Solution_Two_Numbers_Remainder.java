public class Solution_Two_Numbers_Remainder {
    public static void main(String[] args) {
        int result = solution(7, 3);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
