public class Solution_Divide_Pizza_1 {
    public static void main(String[] args) {
        int result = solution(7);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        return answer;
    }

}
