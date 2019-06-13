package project_22nd;
import java.util.Scanner;
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class Mybook extends Book
{
	void setTitle(String s)
	{
	    title=s;
         System.out.println("The title is :"+s);

	}
}
public class Book_Novel
{
   public static void main(String args[])
   {
	   @SuppressWarnings("resource")
  	 Scanner sc=new Scanner(System.in);
  	 String s;
  	 System.out.println("Enter a Novel name");
  	 s=sc.nextLine();
  	 Book obj=new Mybook();
  	 obj.setTitle(s);

   }
}
