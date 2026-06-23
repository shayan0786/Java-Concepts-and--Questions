import java.util.Scanner;

import org.xml.sax.SAXException;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n =  sc.nextInt();
        int count = 2;
        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}
