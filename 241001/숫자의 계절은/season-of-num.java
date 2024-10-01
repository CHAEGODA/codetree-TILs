import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if( m >= 12 || m < 3)
            System.out.println("Winter");
        else if(m < 5) 
            System.out.println("Summer");
        else if(m > 8 || m < 12)
            System.out.println("Fall");
        else    
            System.out.println("Spring");       
                  
    }
}