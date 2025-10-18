import java.util.Arrays;

public class Solution_Array_Cut {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = solution(arr, 1, 3);
        for (int item: result) System.out.println(item);
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2 + 1) - num1];

        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index++] = numbers[i];
        }

        return answer;
    }
}
