import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while (n>0) {
            int rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10;
        }
        System.out.println(pro-sum);
    }
}
