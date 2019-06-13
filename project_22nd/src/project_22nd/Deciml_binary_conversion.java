package project_22nd;
import java.util.Scanner;
public class Deciml_binary_conversion 
{
	public static void main(String args[]) 
    { 
		 int n;
		 @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter n value to convert decimal to binary");
	        n=sc.nextInt();
	        System.out.println("The value is "+Integer.toBinaryString(n));
    }
}

