package project_22nd;
class Critter
{
	 void cri()
	 {
	  System.out.println("CRITTER");
	  System.out.println("......................................");

	 System.out.println("Little Critter is an anthropomorphic character created by Mercer Mayer.");
	 System.out.println("Although it's not specified what species the Little Critter is, he resembles a small and furry rodent-like creature such as a porcupine, hamster, hedgehog, capybara or guinea pig.");	 }
}
class Butterfly extends Critter
{
	void butt()
	{
		System.out.println("BUTTERFLY");
		  System.out.println(".................................");

		System.out.println("All butterflies have complete metamorphosis.");
		System.out.println(" To grow into an adult they go through");
		System.out.println(" 4 stages: \n1.Egg\n2.Larva\n3.Pupa \n4.Adult.");
	}
	void properties()
	{
		System.out.println("The butterfly is in yellow color");
		System.out.println("Butterfly have\n1.antennae\n2.leg\n3.thorax\n4.head\n5.eye");
	}
}
class Critter_Butterfly
{
	public static void main(String args[])
    {
		Butterfly obj=new Butterfly();
		obj.cri();
		obj.butt();
		obj.properties();
    }
}
/*
   */
