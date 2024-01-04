import java.util.Scanner;

public class StudentGradeCalculator 
{

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter EEES marks (out of 100) : ");
        int eeesMarks = scanner.nextInt();

        System.out.print("Enter Discrete Mathematics marks (out of 100) : ");
        int dmMarks = scanner.nextInt();
        
        System.out.print("Enter Data Structure marks (out of 100) : ");
        int dsmMarks = scanner.nextInt();
        
        System.out.print("Enter Digital System marks (out of 100) : ");
        int dsMarks = scanner.nextInt();
        
        System.out.print("Enter OOPM marks (out of 100) : ");
        int oopmMarks = scanner.nextInt();
        
        int marksObtained = eeesMarks + dmMarks + dsmMarks + dsMarks + oopmMarks;

        double percentage = marksObtained / 5 ;
        
        System.out.println("Total Marks: " + marksObtained);
        System.out.printf("Average Percentage: %.2f%%\n", percentage);

        if (percentage >= 91 && percentage <= 100) 
        {
            System.out.println("Grade: A");
        } 
        else if (percentage >= 81 && percentage <= 90) 
        {
            System.out.println("Grade: B");
        } 
        else if (percentage >= 71 && percentage <= 80) 
        {
            System.out.println("Grade: C");
        } 
        else if (percentage >= 61 && percentage <= 70) 
        {
            System.out.println("Grade: D");
        } 
        else 
        {
            System.out.println("Grade: F");
        }   
    }
}
