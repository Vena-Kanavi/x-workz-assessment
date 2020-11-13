3)Write example to convert string to primitive(8)
=>public class Converter{
	public static void main(String[] values)
	{
		System.out.println("The Program will convert string to number");
		
		String pageNo="720";
		short convertedPageNo=Short.parseShort(pageNo);
		System.out.println("converted short : "+convertedPageNo);
		
		String income="90000";
		int convertedIncome=Integer.parseInt(income);
		System.out.println("converted salary : "+convertedIncome);
		
		String keyboardKeys="101";
		byte convertedKeyboardKeys=Byte.parseByte(keyboardKeys);
		System.out.println("converted keyboardKeys : "+convertedKeyboardKeys);
		
		String populationInIndia="1380004385";
		long convertedPopulationInIndia=Long.parseLong(populationInIndia);
		System.out.println("converted populationInIndia : "+convertedPopulationInIndia);
				
		String percentageOfStudent="83.5";
        float convertedPercentageOfStudent=Float.parseFloat(percentageOfStudent);
        System.out.println("converted percentageOfStudent : "+convertedPercentageOfStudent);
		
		String chargeOfElectron="1.60217662";
		double convertedChargeOfElectron=Double.parseDouble(chargeOfElectron);
		System.out.println("converted  chargeOfElectron: "+convertedChargeOfElectron);
		
		String earthIsFlat="false";
		boolean convertedEarthIsFlat=Boolean.parseBoolean(earthIsFlat);
		System.out.println("converted earthIsFlat boolean: "+convertedEarthIsFlat);				
	}
}