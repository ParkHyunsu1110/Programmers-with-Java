import java.util.Scanner;

public class Solution_Even_Odd_Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] solution = solution(arr);
        for (int sol: solution)
            System.out.println(sol);
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num: num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
