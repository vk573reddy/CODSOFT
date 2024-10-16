import java.util.Scanner;

public class studentgrade
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int numberofsubjects = sc.nextInt();
		
		// size of each array indicates, total marks in each subject
		int [] marks = new int[numberofsubjects];
		int totalmarks =0;
		
		for(int i=0;i<numberofsubjects;i++){
		    marks[i]=sc.nextInt();
		    totalmarks = totalmarks+marks[i];
		}
		
		double AveragePercentage = (double) totalmarks/numberofsubjects;
		 String grade; 
		if(AveragePercentage>=90){
		    grade = "A";
		}
		else if (AveragePercentage>=80){
		    grade = "B";
		}
		else if (AveragePercentage>=70){
		    grade = "C";
		}
		else if (AveragePercentage>=60){
		    grade = "D";
		}
		else if (AveragePercentage>=50){
		    grade = "E";
		}
		else{
		    grade ="Fail";
		}
		
		System.out.println("The totals marks of student is:" + totalmarks);
		System.out.println("The AveragePercentage of student is:" + AveragePercentage);
		System.out.println("The final grade of student is:" + grade);
		
		
	}
}
