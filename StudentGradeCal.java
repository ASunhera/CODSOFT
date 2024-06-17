import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subjects = new int[5];
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the marks of subject "+ (i+1)+": ");
            subjects[i] = getInputMarks(sc);
        }
        System.out.println("Total sum of marks obtained : "+ sumOfMarks(subjects));
        System.out.println("Average percentage : " + sumOfMarks(subjects)/subjects.length);
        System.out.println("The Obtained Grade : "+gradeCalculator(sumOfMarks(subjects)/subjects.length));

    }

    public static double sumOfMarks(int[] subjects){
        double sum = 0;
        for (int subject : subjects) {
            sum = sum + subject;
        }
        return sum;
    }
    public static int getInputMarks(Scanner sc){
        int inputMarks;
        while(true){
            inputMarks = sc.nextInt();
            if (inputMarks < 0 || inputMarks > 100){
                System.out.println("invalid input marks ❌");
                System.out.print("Lets input again : ");
            }
            else {
                return inputMarks;
            }
        }
    }
    public static String gradeCalculator(double Marks){
        int marks = (int)Marks;
        if (marks>90){
            return "A";
        } else if (marks>80) {
            return "B";
        } else if (marks>70) {
            return "C";
        } else if (marks>60) {
            return "D";
        } else if (marks>50) {
            return "E";
        } else {
            return "F";
        }

    }
}
