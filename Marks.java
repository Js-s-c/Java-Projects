//converting marks into the percentage
//Code:-
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int English,Math,Science,Physics,Geometry;
        double Percentage,sum;
        System.out.println("Enter your obtain English Subject marks");
        English = s.nextInt();
        System.out.println("Enter your obtain Math Subject marks");
        Math = s.nextInt();
        System.out.println("Enter your obtain Science Subject marks");
        Science = s.nextInt();
        System.out.println("Enter your obtain Physics Subject marks");
        Physics = s.nextInt();
        System.out.println("Enter your obtain Geometry Subject marks");
        Geometry = s.nextInt();

        sum = English+Math+Science+Physics+Geometry;
        Percentage = sum/5;
        System.out.println("Percentage = "+Percentage);
    }
}
