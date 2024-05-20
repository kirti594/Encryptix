package encryptix;

import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter the number of subjects:  ");
		
		int subjectNum = scanner.nextInt();
		double totmarks = 0;
		
		
		for(int i = 1; i<= subjectNum; i++)
		{
			System.out.println("Enter the mark obtained in each Subject: " +i);
			double marks = scanner.nextDouble();
			totmarks += marks;
		}
		double avgPercentage = totmarks/subjectNum;
		
		char grade;
		if(avgPercentage >= 90)
		{
			grade = 'A';
		}
		else if (avgPercentage >=80)
		{
			grade = 'B';
		}
		else if (avgPercentage >= 70)
		{
			grade = 'C';
		}
		else if (avgPercentage >= 60)
		{
			grade = 'D';
		}
		else if (avgPercentage >= 50)
		{
			grade = 'E';
		}
		else
			grade = 'F';
		
		System.out.println("\n The Total Marks of the sudent: "+totmarks);
		System.out.println("Average Percentage:  " +avgPercentage);
		System.out.println("Grade: " +grade);
		scanner.close();
	}
	
}

