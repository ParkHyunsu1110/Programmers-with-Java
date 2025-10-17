public class Solution_Array_Average {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        double result = solution(array);
        System.out.println(result);
    }

    public static double solution(int[] numbers) {
        double answer = 0.0;
        for (int num: numbers) answer += num;
        return answer/numbers.length;
    }
}
