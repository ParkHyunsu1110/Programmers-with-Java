import java.util.Arrays;

public class Solution_Fraction_Plus {
    public static void main(String[] args) {
        int[] result = solution(1, 2, 3, 4);
        for (int arr: result) System.out.println(arr);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer(numer1, denom2) + numer(numer2, denom1);
        int denom = denom(denom1, denom2);

        int[] answer = {numer, denom};

        return reducedFraction(answer);
    }

    private static int numer(int numer, int denom) {
        return numer * denom;
    }

    private static int denom(int denom1, int denom2) {
        return denom1 * denom2;
    }

    private static int[] reducedFraction(int[] arr) {
        int length = Math.min(arr[0], arr[1]);
        int value = 1;

        for (int i=length; i>1; i--) {
            if (arr[0] % i == 0 && arr[1] % i == 0) {
                value = i;
                break;
            }
        }

        arr[0] = arr[0] / value;
        arr[1] = arr[1] / value;

        return arr;
    }
}
