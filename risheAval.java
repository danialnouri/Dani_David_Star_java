import java.util.Scanner;

public class risheAval {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        boolean right = false;
       while (n % 2 == 0 ) {
           if (n%2 == 0 && right == false){
               System.out.println(2 + " ");
               right = true;
           }
           
           n /= 2;
           
       }
       for (int i = 3; i <= Math.sqrt(n); i +=2){
            boolean hey = false;
            while (n % i == 0){
                if (n%i==0 && hey == false){
                    System.out.println(i + " ");
                    hey = true;
                }
                
                n /= i;
            }
       }

       if (n > 2){
           System.out.println(n);
       }

        
 
    }

}