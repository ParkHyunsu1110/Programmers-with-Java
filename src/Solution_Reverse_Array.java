import java.util.Arrays;

public class Solution_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 3, 5};
        int[] result = solution(arr);
        for (int item: result) System.out.println(item);
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[array.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[array.length - 1 - i];
        }

        return answer;
    }
}
