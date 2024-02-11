
public class Program {
	//creating the static variable
	static int x,y;
	//creating the static block
	static
	{
		System.out.println("Static Block");
		x=10;
		y=20;
	}
	//creating the static method
	static void disp1()
	{
		System.out.println("Static Method");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	//creating the non static variables
	int p,q;
	//creating the non static block
	{
		System.out.println("Non Static block");
		 p=55;
		 q=65;
		 x=75;
		 y=85;
	}
	//creating the non static method
	void disp2()
	{
		System.out.println("Non static method");
		System.out.println("P:"+p);
		System.out.println("Q:"+q);
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	//creating the constructor
	Program()
	{
		System.out.println("Constructor");
	}
	

}
