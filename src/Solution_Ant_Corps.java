public class Solution_Ant_Corps {
    public static void main(String[] args) {
        int result = solution(24);
        System.out.println(result);
    }

    public static int solution(int hp) {
        int answer = 0;

        answer += hp / 5;
        hp = hp % 5;

        answer += hp / 3;
        hp = hp % 3;

        answer += hp;
        return answer;
    }
}
