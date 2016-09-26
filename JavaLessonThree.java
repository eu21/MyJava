public class JavaLessonThree {
	
	public static void main (String[] args)
	{

		char theGrade = 'a';
		
		switch (theGrade)
		{
		case 'a': //Check for multiple
		case 'A':
			System.out.println("Great job");
			break;
		case 'b':
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Ok");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("You Failed");
			break;
			

		}
		
	}

	
}