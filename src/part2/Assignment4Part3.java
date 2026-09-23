package part2;

import java.util.Scanner;

public class Assignment4Part3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //scanner initialization
        System.out.printf("Enter student's name:");
        String name = cin.nextLine();
        System.out.printf("Enter course name:");
        String course = cin.nextLine();
        float check=2; // initialization of variables outside the loop
        float quizzesWeight = 0;
        float projectsWeight = 0;
        float activitiesWeight = 0;
        float attendanceWeight = 0;
        float examsWeight = 0;
do { // do while loop to verify the correctness of the entered coefficients
    System.out.printf("Enter quizzes weight: ");
    quizzesWeight = cin.nextFloat();
    System.out.printf("Enter projects weight: ");
    projectsWeight = cin.nextFloat();
    System.out.printf("Enter activities weight: ");
    activitiesWeight = cin.nextFloat();
    System.out.printf("Enter attendance weight: ");
    attendanceWeight = cin.nextFloat();
    System.out.printf("Enter exams weight: ");
    examsWeight = cin.nextFloat();

    check = examsWeight + attendanceWeight + activitiesWeight + projectsWeight + quizzesWeight;
    if (check!=1)    System.out.printf("Invalid weight!!! Try again");
} while (check!=1);

        System.out.printf("Enter quizzes average: "); //entering rest data
        double quizzesAverage = cin.nextDouble();
        System.out.printf("Enter projects average: ");
        double projectsAverage = cin.nextDouble();
        System.out.printf("Enter activities average: ");
        double activitiesAverage = cin.nextDouble();
        System.out.printf("Enter attendance average: ");
        double attendanceAverage = cin.nextDouble();
        System.out.printf("Enter exams average: ");
        double examsAverage = cin.nextDouble();

        double finalScore = (quizzesWeight * quizzesAverage) //calculations
                + (projectsWeight * projectsAverage)
                + (activitiesWeight * activitiesAverage)
                + (attendanceWeight * attendanceAverage)
                + (examsWeight * examsAverage);

        System.out.printf("Hi %s  \n You have a %.1f%%  in your %s  course.", name, finalScore*100,course );//output
    }
}