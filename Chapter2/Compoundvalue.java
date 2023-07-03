import java.util.Scanner;
public class Compoundvalue {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int money = 0 , time = 12; double r = 0.05,compoundvalue= 0.0;
        double monthlyrate = r / time ;
        System.out.println("Enter the monthly saving amount: ");
        money = input.nextInt();
        for(int i =0; i < 6 ; i++)
        {
            compoundvalue = (compoundvalue + money) * (1 + monthlyrate);
        }
        System.out.println("After the sixth month, the account value is $"+ compoundvalue);

}
}