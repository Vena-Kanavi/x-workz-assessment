5)What is Encapsulation? Explain with an example
=>Encapsulation is the process of binding data and corresponding method into single unit.Here we are hiding fields and providing access using methods.
     Read access is given by getter method and Write access given by setter method.
	 
	 ex:public class AppLock{
	      private static String unlock="Pin";
	      public static String getUnlock(){	
		 return unlock;
	     }
         public static void setUnlock(String lock){
             if(lock.equals("pattern")){
				 System.out.println("New lock is "+lock);
			 }
			 else{
				 System.out.println("not matching");
				 
			 }
	     }
         }
		 
		 
		
		public class LockTester{
	    public static void main(String[] swipe){
		System.out.println("encapsulation example");
		String lock=AppLock.getUnlock();
		System.out.println("Screen lock is  "+lock);
		String value=swipe[0];
		AppLock.setUnlock(value);
	    }
        }