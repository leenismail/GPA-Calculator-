
import java.util.Scanner;

public class GPA {

public static void main(String[] args) {

	int course;
	int grade;
	int CourseSum=0;//Sum of all courses
	double CmltivSum=0;//Cumulative grades sum
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please enter number of semesters:");
	int semester = s.nextInt();
	
	for (int j = 0; j < semester; j++) {
		
		double SmstrSum=0;//Sum of grades in each semester
		System.out.println("For semester number "+(j+1)+":");
		System.out.println("    Enter the number of passed courses:");
		course = s.nextInt();
		CourseSum=CourseSum+course;
	
		for (int i = 0; i <course; i++) {
			
			System.out.println("    Enter grade number" +(i+1)+ ":");
			grade = s.nextInt();
		
			if (grade>=35) {
			CmltivSum=CmltivSum+grade;
			SmstrSum=SmstrSum+grade;
			}
			else {
				System.out.println("    Invalid Input!, Please enter a mark above 35.");
				i=i-1;
				
			}
			
		}
		double totalSem=(((SmstrSum/course)/100)*4);
	
		System.out.println("\n    Semester GPA: "+totalSem+"/4\n");
	}
	double totalCum=(((CmltivSum/CourseSum)/100)*4);
	System.out.println("    Cumulative GPA: "+totalCum+"/4");
}
}