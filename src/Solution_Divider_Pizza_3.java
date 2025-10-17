public class Solution_Divider_Pizza_3 {
    public static void main(String[] args) {
        int result = solution(4, 12);
        System.out.println(result);
    }

    public static int solution(int slice, int n) {
        int answer = n % slice == 0 ? n / slice : n / slice + 1;
        return answer;
    }
}
