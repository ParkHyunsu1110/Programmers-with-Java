import java.util.*;

public class Solution_Get_Mode {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2};
        int result = solution(array);
        System.out.println(result);
    }

    public static int solution(int[] array) {
        Map<Integer, Integer> answer = new HashMap<>();

        for (int arr: array) {
            answer.put(arr, answer.getOrDefault(arr, 0) + 1);
        }

        int countMax = 0;
        for (int count: answer.values()) {
            countMax = Math.max(countMax, count);
        }

        int result = -1;

        int modeCount = 0;
        for (Map.Entry<Integer, Integer> entry : answer.entrySet()) {
            if (entry.getValue() == countMax) {
                modeCount++;
                if (modeCount == 1) {
                    result = entry.getKey();
                } else {
                    result = -1;
                }
            }
        }

        return result;
    }
}
