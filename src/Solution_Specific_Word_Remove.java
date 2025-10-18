public class Solution_Specific_Word_Remove {
    public static void main(String[] args) {
        String result = solution("abcdef", "f");
        System.out.println(result);
    }

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
