import java.util.Arrays;

public class Solution_Get_Array_Center {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        int result = solution(array);
        System.out.println(result);
    }

    public static int solution(int[] array) {
        int answer = 0;
        int[] srtArray = Arrays.stream(array).sorted().toArray();
        answer = srtArray[srtArray.length/2];
        return answer;
    }
}
