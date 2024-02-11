package professorprogram;

public class Professor {
	//static variables
	static String UnivName="VTU";
	static int totalProf=0;
	
	//Non static variables
	int ProfId;
	String subject;
	
	//static block
	static
	{
		System.out.println("Welcome To"+UnivName);
	}
	
	//Non Static block
	{
		totalProf+=1;
		ProfId= totalProf;
		System.out.println("Hiring a new Professor...");
	}
	
	//static method
    public static int getTotalProf()
	{
		return totalProf;
	}
    
    //Non static method
    public void teach()
    {
    	System.out.println("Professor ID:"+ProfId+"is teaching"+subject);
    }
    
    //Constructor
    public Professor(String subject)
    {
    	this.subject=subject;
    }
    
    //main method
	
	public static void main(String[] args) {
	System.out.println("Total professors at start:"+Professor.getTotalProf());
	System.out.println("--------------------------------");
	Professor prof1=new Professor("Java");
	prof1.teach();
	Professor prof2=new Professor("SQL");
	prof2.teach();
	System.out.println("--------------------------------");
	System.out.println("Total professors now:"+Professor.getTotalProf());

	}

}
