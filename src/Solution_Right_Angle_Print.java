import java.util.Scanner;

public class Solution_Right_Angle_Print {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
