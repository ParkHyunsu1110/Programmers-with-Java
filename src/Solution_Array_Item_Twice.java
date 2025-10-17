import java.util.Arrays;

public class Solution_Array_Item_Twice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = solution(array);
        for (int nums: result)
            System.out.println(nums);
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i< numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
