import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int c = 2;
        while (c*c <= n) {
            if(n%c==0){
                System.out.println("Not Prime  ");
                break;
            }
            c = c + 1;
        }
        if(c*c>n){
            System.out.println("Prime...");
        }
    }

}
