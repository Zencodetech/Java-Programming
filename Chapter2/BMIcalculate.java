import java.util.Scanner;
public class BMIcalculate {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        double pounds = 0.0, height = 0.0;
        System.out.println("Enter weight in pounds: ");
         pounds = input.nextDouble();
        System.out.println("Enter height in inches : ");
         height = input.nextDouble();
         double mass = pounds * 0.45359237;
         double lenght = height * 0.0254;
         double bmi = mass / (lenght * lenght);
         System.out.println("BMI is "+bmi);
    }

}