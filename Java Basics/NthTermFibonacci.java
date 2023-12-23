import java.util.Scanner;
public class NthTermFibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        if(n==1)
        System.out.println("1st term of fibonacci series is:"+a);
        else if(n==2)
        System.out.println("2nd term of fibonacci series is:"+b);
        else{
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(n+"th term of fibonacci series is:"+c);
    }

    }
}