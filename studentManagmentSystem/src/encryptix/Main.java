package encryptix;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		StudentManagementSystem sms = new StudentManagementSystem();
		sms.loadFromFile("students.txt");
		
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(running) 
		{
			System.out.println("\n .....Student Management System.....");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Save Student to File");
			System.out.println("6. Exiting form Student Management System....");
			System.out.println("Enter your Choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) 
			{
			case 1:
				System.out.println("Enter student name: ");
				String name = scanner.next();
				System.out.println("Enter Roll Number: ");
				int rollNumber = scanner.nextInt();
				System.out.println("Enter student Grade: ");
				String grade = scanner.next();
				
				if (sms.validateStudentData(name, rollNumber, grade)) 
				{
					sms.addStudent(new Student(name, rollNumber, grade));
					System.out.println("Student added successfully...");
				}
				else
					System.out.println("Invalid input! \n Please enter valid data");
				break;
			case 2:
				System.out.println("Enter roll number of student to remove: ");
				int removeRollNumber = scanner.nextInt();
				sms.removeStudednt(removeRollNumber);
				System.out.println("Student removed successfully..");
				break;
			case 3:
				System.out.println("Enter Roll Number of student to search: ");
				int searchRollNumber = scanner.nextInt();
				Student searchedStudent = sms.searchStudent(searchRollNumber);
				if (searchedStudent != null) 
				{
					System.out.println("Student found: "+searchedStudent);
				}
				else 
				{
					System.out.println("Student not found..");
				}
				break;
			case 4:
				sms.displayAllStudents();
				break;
			case 5:
				sms.saveToFile("students.txt");
				System.out.println("Students saved to file..");
				break;
			case 6:
				running = false;
				break;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 6.");
			}
		}
		scanner.close();
	}

}
