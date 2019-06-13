package project_22nd;
class Area 
{
	static double pi=3.147;
    double r=7;
    int l=4;
    int b=4;
    int a=4;
}
class circle extends Area
{
	void cir_disp()
	{
			   double c;
			   c=pi*r*r;
			   System.out.println("Area of circle is "+c);
	}
}
class rectangle extends Area
{
	void rect_disp()
	{
	  int c=l*b;
	 System.out.println("Area of rect is "+c);
    }
}
class square extends Area
{
	void squ_disp()
	{
		System.out.println("Area of square is "+a*a);
	}
}
class sphere extends Area
{
	void sphe_disp()
	{
		System.out.println("Area of sphere is  "+4*pi*r*r);
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		circle o1=new circle();
		o1.cir_disp();
		rectangle o2=new rectangle();
		o2.rect_disp();
		square o3=new square();
		o3.squ_disp();
		sphere o4=new sphere();
		o4.sphe_disp();
		
	}
}
