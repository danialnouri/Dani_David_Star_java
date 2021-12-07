import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();


        for (int n = 1; n < m+ 1 ; n++)
            if (n < 2) {
                System.out.println("not prime");
                

            }
            else if (n == 2) {
                System.out.println("prime");
            

            }

            else if (n % 2 == 0){
                System.out.println("non prime");
            }

            else{

                int i = 3;
                boolean nonprime = false;

                
                while (i < (int) Math.sqrt(n) && nonprime == false) {

                    if (n % i == 0) {
                        System.out.println("non prime");
                        nonprime = true;
                    } else {
                        i += 2;
                    }

                }

                if (nonprime != true) {
                    System.out.println("is prime");
                }
                
            }
        
    }

}
