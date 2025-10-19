public class Solution_Where_Is_Dot {
    public static void main(String[] args) {
        int[] dot = {2, 3};
        int result = solution(dot);
        System.out.println(result);
    }

    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) return 1;
        else if (dot[0] < 0 && dot[1] > 0) return 2;
        else if (dot[0] < 0 && dot[1] < 0) return 3;
        else return 4;
    }
}
