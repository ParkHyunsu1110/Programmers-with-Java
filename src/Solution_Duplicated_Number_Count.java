public class Solution_Duplicated_Number_Count {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int result = solution(arr, 1);
        System.out.println(result);
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int isArr : array) {
            if (isArr == n) answer++;
        }
        return answer;
    }
}

// 2025.10.17
