import java.util.Scanner;

public class Prime_No_By_FunctionMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
    }
    static int isPrime(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                return 1;
            }
            else{
                return 0;
            }
        }
            }
}