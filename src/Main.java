import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
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

        
    }
}