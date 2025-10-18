public class Solution_Beads_Divide_Number_Of_Cases {
    public static void main(String[] args) {
        double result = solution(5, 3);
        System.out.println(result);
    }

    public static double solution(int balls, int share) {
        double answer = 1;
        for (int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i +1);
        }
        return answer;
    }
}
