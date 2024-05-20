package encryptix;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManagementSystem 
{
	private List<Student> students;
	public StudentManagementSystem() 
	{
		this.students = new ArrayList<>();
	}
	public void addStudent(Student student) 
	{
		students.add(student);
	}
	public void removeStudednt(int rollNumber) 
	{
		for (Student student : students) 
		{
			if(student.getRollNumber() == rollNumber) 
			{
				students.remove(student);
				break;
			}
		}
	}
	public Student searchStudent(int rollNumber) 
	{
		for (Student student : students) 
		{
			if(student.getRollNumber() == rollNumber) 
			{
				return student;
			}
		}
		return null;
	}
	public void displayAllStudents() 
	{
		for(Student student : students) 
		{
			System.out.println(student);
		}
	}
	public void saveToFile(String fileName) 
	{
		try(PrintWriter writer = new PrintWriter(fileName))
		{
			for (Student student : students)
			{
				writer.println(student.getName()+","+ student.getRollNumber()+","+student.getGrade());
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public void loadFromFile(String fileName) 
	{
		try (Scanner scanner = new Scanner(new File(fileName)))
		{
			while(scanner.hasNextLine()) 
			{
				String line = scanner.nextLine();
				String[] parts = line.split(",");
				if(parts.length == 3) 
				{
					students.add(new Student(parts[0], Integer.parseInt(parts[1]),parts[2]));
				}
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public boolean validateStudentData(String name, int rollNumber, String grade)
	{
		return !name.isEmpty() && !grade.isEmpty() && rollNumber > 0;
	}

}
