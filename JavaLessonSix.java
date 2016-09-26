import java.io.*;

public class JavaLessonSix {

	public static void main(String[] args) {
		getAFile("./somestuff.txt");

	}

	public static void getAFile(String fileName) {
		
		try
		{
		FileInputStream file = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Sorry can't find that file");
		}
		
		catch(IOException e)
		{
			System.out.println("Unknown IO Error");
		}
		
		catch(ClassNotFoundException | IOException e) {
			
		}
		
		catch(Exception e)
		{
			System.out.println("Some error occured");
		}

		finally { //is always called
			System.out.println("");
		}
		
		
		}

	

}