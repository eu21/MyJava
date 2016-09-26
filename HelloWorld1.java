public class HelloWorld1
{
	
	public static void main(String[] args)
	{
	
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.14152900000000000;
		
		
		
		boolean trueOrFalse = true;
		
		char randomChar = 66;
		char anotherChar = 'A'; 
		
		System.out.println(randomChar);
		
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		
		String andAnotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigByte);
		String floatString = Float.toString(bigByte);
		String doubleString = Double.toString(bigByte);
		//String booleanString = Boolean.toString(bigByte);
		
		double aDoubleValue = 3.141529;
		
		int doubleToInt = (int)aDoubleValue;
		
		int stringToInt = Integer.parseInt(intString);
			
		System.out.println(stringToInt);
				
				
				
				
				
				
				
				
				
				
				
	}
}