public class Solution_Morse_Code_1 {
    public static void main(String[] args) {
        String result = solution(".... . .-.. .-.. ---");
        System.out.println(result);
    }

    public static String solution(String letter) {
        String answer = "";

        String[] letterSplit = letter.split(" ");
        int[] letterIndex = new int[letterSplit.length];

        String[] morse = {".-", "-...", "-.-.", "-..",
                ".", "..-.", "--.",
                "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...",
                "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < letterSplit.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letterSplit[i].equals(morse[j])) {
                    letterIndex[i] = j;
                }
            }
        }

        for (int index : letterIndex) {
            answer += (char) (index + 97);
        }

        return answer;
    }
}
