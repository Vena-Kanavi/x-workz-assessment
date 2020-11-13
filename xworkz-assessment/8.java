8)Explain Method overloading with two example.
=>Two or more methods have the same method name but different number of parameters.
     ex:   add(int)
	        add(int,int)
			add(int,float)
			
			
ex1:public class Pen
     {
	  public static void main(String[] notes){
				System.out.println("invoked main");
				writing("Panchatantra");
				writing(1,"Panchatantra",50.0f,'A');
	}
	public static void writing(String stories)
	{
		
		System.out.println("arg stories:  "+stories);
		
	}
	public static void writing(int indexNo,String stories,float percentageOfInk,char grade)
	{
		System.out.println("arg1 indexNo  "+indexNo);
		System.out.println("arg2 stories   "+stories);
		System.out.println("arg3 percentageOfInk  "+percentageOfInk);
		System.out.println("arg4 grade  "+grade);
	}
	}
	
	
******************************************************************	
	
ex2:public class Mobile
     {
	  public static void main(String[] emergency){
				writing("Father");
				writing(5,"Father","Vishala");
	}
	public static void calling(String family)
	{
		
		System.out.println("arg family:  "+family);
		
	}
	public static void writing(int emergencylist,String family,String friends)
	{
		System.out.println("arg1 emergencylist  "+emergencylist);
		System.out.println("arg2 family   "+family);
		System.out.println("arg3   friends"+friends);
	}
	}