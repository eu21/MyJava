public class GetMail implements Runnable{
	
	private int startTime;
	
	
	//A constructor returns what? Never returns anything.
	//But it looks like we can pass arguments to a constructor.
	public GetMail(int startTime) {
		this.startTime = startTime;
	}
	
	public void run() {
		try {
			Thread.sleep(startTime*1000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Checking mail");
	}
	
}