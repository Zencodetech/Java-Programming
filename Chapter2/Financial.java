import java.util.Scanner;
public class Financial {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int subtotal = 0 ; double gratuity = 0 ;
        System.out.println("Enter the subtotal and a gratuity rate : ");
        subtotal = input.nextInt();
        gratuity = input.nextInt();
        gratuity = (gratuity * subtotal)/100 ;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is $"+gratuity+" and thr total is $"+total);

}
}
