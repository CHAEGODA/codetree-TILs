import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        int c;
        String d;
        a = sc.nextInt();
        b = sc.next();
        c = sc.nextInt();
        d = sc.next();

        if((a >= 19 && b == "M"  ) || (c >= 19|| d == "M"))
            System.out.println("1");
        else
            System.out.println("0");    
    }
}