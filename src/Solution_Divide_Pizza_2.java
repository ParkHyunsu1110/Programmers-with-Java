public class Solution_Divide_Pizza_2 {
    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        int index = 1;
        while(true) {
            if ((n * index) % 6 == 0) {
                answer = (n * index) / 6;
                break;
            }
            index++;
        }

        return answer;
    }
}
