import java.util.Scanner;

import java.util.Scanner;
public class Con {
    public static void main(String[] args) {
        int a, b, c;
        float t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sub 1 marks");
        a = s.nextInt();
        System.out.println("Enter Sub 2 marks");
        b = s.nextInt();
        System.out.println("Enter Sub 3 marks");
        c = s.nextInt();

        t = (a+b+c)/3.0f;
        if (a >= 33 && b >= 33 && c >= 33 && t > 40) {

            System.out.println("Your pass");

        }

        else
        {
            System.out.println("Your fail");
        }

    }
}
