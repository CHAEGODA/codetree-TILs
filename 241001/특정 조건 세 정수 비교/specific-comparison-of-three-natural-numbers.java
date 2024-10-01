import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, min;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a < b)
            min = a;
        else    
            min = b;
        if(min > c)
            min = c;        
        
        if(min == a)
            System.out.print("1 ");
        else   
            System.out.print("0 ");
        if (a == b && b == c)
            System.out.print("1 ");
        else
            System.out.print("0 ");
    }
}