public class Solution_Protractor {
    public static void main(String[] args) {
        int result = solution(90);
        System.out.println(result);
    }

    public static int solution(int angle) {
        if (angle == 180) return 4;
        else if (180 > angle &&  angle > 90) return 3;
        else if (angle == 90) return 2;
        else if (90 > angle &&  angle > 0) return 1;
        else return 0;
    }
}
