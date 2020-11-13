6)Explain array with example.
=>Array is a collection elements of similar datatype.
ex:public class Grade{
	public static void main(String[] boxes)
	{
		arrayOfGrade();
	}
	public static void arrayOfGrade()
	{
		 System.out.println("invoked arrayOfGrade");
	
		 char sslcGrade='A';
		 char pucGrade='A';
		 char degreeGrade='C';
	     char[] grades={sslcGrade,pucGrade,degreeGrade};
		 int sizeOfArray=grades.length;
		 System.out.println("Total elements "+sizeOfArray);
		 char elementAtIndex0=grades[0];
		 System.out.println("Element at index zero "+elementAtIndex0);
	}
	}