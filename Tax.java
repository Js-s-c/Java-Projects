import java.util.Scanner;
public class Con {
    public static void main(String[] args) {
       float income,tax;
       tax = 0;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your income");
       income = s.nextFloat();
       if(income<2.5)
        {
            tax = tax +0;
        }
        else if(income >=2.5f && income <=5f)
       {
           tax = tax + 0.05f * (income -2.5f);
       }
        else if (income >5f && income<=10f)
        {
            tax = tax + 0.05f * (income -2.5f);
            tax = tax + 0.2f * (income -5f);

       }
       else if (income >10f)
       {
           tax = tax + 0.05f * (income -2.5f);
           tax = tax + 0.2f * (income -5f);
           tax = tax + 0.3f * (income -10f);

       }
        System.out.println("Tax = "+tax);

    }
}
