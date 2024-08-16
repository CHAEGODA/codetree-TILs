import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        double b = w * 10000 / (h * h);

        System.out.println((int)b);
        if(b >= 25) {
            System.out.println("Obesity");
        }

    }
}