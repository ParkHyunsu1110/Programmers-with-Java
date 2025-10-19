public class Solution_Make_2D {
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] result = solution(num_list, 3);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}
