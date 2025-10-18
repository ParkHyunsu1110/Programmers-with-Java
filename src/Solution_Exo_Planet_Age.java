public class Solution_Exo_Planet_Age {
    public static void main(String[] args) {
        String result = solution(23);
        System.out.println(result);
    }

    public static String solution(int age) {
        String[] ageStArr = String.valueOf(age).split("");
        String answer = "";
        for (int i = 0; i<ageStArr.length; i++) {
            answer += (char) (Integer.parseInt(ageStArr[i]) + 97);
        }
        return answer;
    }
}
