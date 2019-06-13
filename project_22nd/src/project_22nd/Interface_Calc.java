package project_22nd;
import java.util.Scanner;
interface AdvancedArthimetic
{
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArthimetic
{
	public
	int divisor_sum(int n)
	{
		int sum=0;
		int i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
				System.out.println(i);
			}
		
		}
		return sum;
	}
}

public class Interface_Calc
{
     public static void main(String args[])
     {
    	 int n;
    	 @SuppressWarnings("resource")
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.println("Enter a value for a divison");
    	 n=sc.nextInt();
    	 AdvancedArthimetic obj=new MyCalculator();
    	 int sum=obj.divisor_sum(n);
 		
 		System.out.println("sum is "+sum);
    	 
     }
}
