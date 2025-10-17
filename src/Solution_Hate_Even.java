import java.util.ArrayList;

public class Solution_Hate_Even {
    public static void main(String[] args) {
        int[] result = solution(10);
        for (int i: result) System.out.println(i);
    }

    public static int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? (n/2) : (n/2 + 1)];

        int index = 0;
        for (int i = 1; i<=n; i++)
            if (i % 2 != 0)
                answer[index++] = i;
        return answer;
    }
}
