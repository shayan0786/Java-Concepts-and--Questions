import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // // Q1 Find the largest number 1 st approach
        // int max = a;
        // if(max < b){
        //     max = b;
        // }
        // if(max < c){
        //     max = c;
        // }
        // int max = 0;
        // if(a > max){
        //     max = a;
        // }
        // else{
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
