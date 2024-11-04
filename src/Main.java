import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1; //random value between 1-100
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) {
                System.out.printf(" | " + dataPoints[i]); //adds space between the values

            }
        }
        System.out.println();

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        average = (double) sum / dataPoints.length; //convert sum into a double

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        //get number from user
        int userInput = SafeInput.getRangedInt(sc,"Enter a number between", 1, 100);
        System.out.println("You entered " + userInput);

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                count++;
            }
        }

        System.out.println("The value " + userInput + " was found " + count + " times in the array.");

        //find user number in the array
        boolean done = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                System.out.println("The value " + userInput + " was found at array index " + i + ".");
                done = true;
                break;
            }
        }
        if (!done) {
            System.out.println("The value " + userInput + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            } else if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}