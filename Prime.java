import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check Prime: ");
        int num = scanner.nextInt();
        if(num==1){
            System.out.println("Neither prime nor composite");
        }
        else{
            int count = 2;//10
            boolean isPrime = true;
            while(count<num){
                if(num%count==0){
                    System.out.println("Not Prime");
                    isPrime = false;
                    break;
                }
                count++;
            }
            if(isPrime){
                System.out.println("Prime");
            }
        }  
    }
}