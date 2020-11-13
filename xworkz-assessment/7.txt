7)Write code to display elements of an array?
=>array elements can be displayed by using the index value.
ex:public class Countrys{
     public static void main(String[] countrys)
   {
	System.out.println("Countrys in the world "+ countrys);
	int sizeOfMainParam=countrys.length;
	System.out.println("sizeOfMainParam " +sizeOfMainParam);
	System.out.println("Element @ index 0 "+countrys[0]);
	System.out.println("Element @ index 1 "+countrys[1]);
	System.out.println("Element @ index 2 "+countrys[2]);
	}
    }