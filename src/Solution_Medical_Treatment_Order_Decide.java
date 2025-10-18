import java.util.*;

public class Solution_Medical_Treatment_Order_Decide {
    public static void main(String[] args) {
        int[] arr = {3, 76, 23};
        int[] result = solution(arr);
        for (int item: result) System.out.println(item);
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Map<Integer, Integer> order = new HashMap<>();
        for (int i=0; i < emergency.length; i++) {
            order.put(emergency[i], i);
        }

        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);

        int rank = 1;
        for (int i = sortedEmergency.length - 1; i >= 0; i--) {
            int value = sortedEmergency[i];
            int originalIndex = order.get(value);
            answer[originalIndex] = rank++;
        }

        return answer;
    }
}
