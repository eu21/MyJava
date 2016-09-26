public class  MyTest
{
	
	public static void main(String[] args)
	{
		
	byte theGrade=11;
	
	switch(theGrade) {
	
	
	case 1 :{
		System.out.println("Very Bad");
		break;
	}	
	case 6 :{
		System.out.println("Bad");
		break;
	}	
	case 3 :{
		System.out.println("Still Bad");
		break;
	}	
	case 4 :{
		System.out.println("So so");
		break;
	}	
	case 5 :{
		System.out.println("Good");
		break;
	}
	
	case 10 :{
		System.out.println("The best");
		break;
	}
	
	default : {
		//Works every time, if there is no breaks in upper cases.
		System.out.println("nothing");
	}
		}
		
	}
	
}