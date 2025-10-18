public class Solution_Lamb_Skewers {
    public static void main(String[] args) {
        int result = solution(10, 3);
        System.out.println(result);
    }

    public static int solution(int n, int k) {
        int nT = (n * 12000);
        if (n >= 10) k -= n/10;
        int kT = k * 2000;
        return nT + kT;
    }
}
