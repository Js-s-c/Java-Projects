//converting KM into the Mils
//Code:-
import java.util.Scanner;

public class Mils {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Kilometer,mils ;
        System.out.println("Enter Kilometer to convert in mils");
        Kilometer = s.nextInt();
        mils = Kilometer/1.609;
        System.out.println("Mils = " +mils);
    }
}
