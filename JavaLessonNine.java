import java.util.Arrays;

public class JavaLessonNine {
	
	public static void main(String[] args)
	{
		
		int[] randomArray;
		
		int[] numberArray = new int[10];
		
		
		randomArray = new int[20];
		
		randomArray[1] = 2;
		
		String[] stringArray = {"just","random","words"};		
		
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = i;
		}
		
		int k =1;
		while(k <=41) { System.out.print('-'); k++; }
		System.out.println();
		
		for(int j = 0; j < numberArray.length; j++)
		{
			System.out.print("| "+ j + " ");
		}
		
		k =1;
		System.out.print('\n');
		while(k <=41) { System.out.print('-'); k++; }
		System.out.println();
		
		
		String[][] multiArray = new String[10][5];
		
		for(int i =0; i < multiArray.length; i++)
		{
			
			for(int j = 0; j < multiArray[i].length; j++)
			{
				multiArray[i][j]= i + "" + j;
		
			}
			
		}
		
		multiArray[5][3]="X";

		for(int i =0; i < multiArray.length; i++)
		{
			
			for(int j = 0; j < multiArray[i].length; j++)
			{
				
				System.out.print(multiArray[i][j]);
				
			}
			System.out.print('\n');
		}
		
	}
	
	
}