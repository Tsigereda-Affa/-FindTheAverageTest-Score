import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //A program is needed to prompt the user operator for ten exam scores, calculate the average score and display the result to the screen.
        // The average score is calculated as the sum of the scores divided by the number of scores.
        Scanner sca = new Scanner(System.in);
        System.out.println("put the score");
        int A = sca.nextInt();
        int B = sca.nextInt();
        int C = sca.nextInt();
        int D = sca.nextInt();
        int E = sca.nextInt();
        int F = sca.nextInt();
        int G = sca.nextInt();
        int H = sca.nextInt();
        int I = sca.nextInt();
        int J = sca.nextInt();

        int sumOfTheScore = (A+B+C+D+E+F+G+H+I+J);
        //System.out.println(sumOfTheScore);
        int averagescore=(sumOfTheScore /10);
                System.out.println("average score is:" + averagescore);
    }
}
