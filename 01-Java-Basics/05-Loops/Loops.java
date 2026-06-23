// Loop → Loops are used to iterate a part of program several times. 

public class Loops {
    public static void main(String[] args) {
        // for loop :- It is generally used when we know how many times loop will iterate. 
        // for(initialization;condition;increment/decrement){
                // body 
        // }
        // Print 1 to 5 number
        for(int i = 1;i<=5;i++){
            // System.out.println(i);
        }


        // While Loop :- It is used when we don’t know how many time the loop will iterate
        // while (condition) {
            // code to be excuted 
            //increment/decrement 
        // }

        int num = 1;
        while (num <=5) {
            // System.out.println(num);
            num++;
        }
        // do while loop :- It is used when we want to execute our statement at least one time. 
        // → It is called exit control loop because it checks the condition after execution of statement. 

        // do{

        // }while(condition);
        
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}
