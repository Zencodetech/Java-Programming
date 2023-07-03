import java.util.Scanner;
public class Costofdriving {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double distance , miles , price;
        System.out.println("Enter the driving distance : ");
        distance = input.nextDouble();
        System.out.println("Enter miles per gallon : ");
        miles = input.nextDouble();
        System.out.println("Enter price per gallon : ");
        price = input.nextDouble();
        double cost = (distance / miles) * price ;
        System.out.println("The cost of driving is $"+cost);
    }

}