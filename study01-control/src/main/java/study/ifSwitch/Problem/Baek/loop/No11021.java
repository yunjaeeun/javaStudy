package study.ifSwitch.Problem.Baek.loop;

import java.util.Scanner;

/* a+b를 조금 더 아름답게 출력 */
public class No11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (num1 + num2));
        }
    }
}
