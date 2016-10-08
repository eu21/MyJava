public class LessonSeventeen{
	
	public static void main(String[] args) {
		
		Thread getTime = new GetTime20();
		
		Runnable getMail1 = new GetMail(10);
		Runnable getMail1Again = new GetMail(20);
		
		
		getTime.start();
		
		new Thread(getMail1).start();
		new Thread(getMail1Again).start();
		
	}
	
	
	
	
	
}