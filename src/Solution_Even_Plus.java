public class Solution_Even_Plus {
    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) if (i % 2 == 0) answer += i;
        return answer;
    }
}
