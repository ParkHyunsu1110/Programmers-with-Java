public class Solution_Taller_than_Musseok {
    public static void main(String[] args) {
        int[] arr = {149, 180, 192, 170};
        int result = solution(arr, 167);
        System.out.println(result);
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int arr: array) {
            if (arr > height) answer++;
        }
        return answer;
    }
}
