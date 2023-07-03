import java.util.Scanner;
public class Volumeofcylinder {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double area = 0.0 ,v = 0.0; double r , l;
        System.out.println("Enter the radius and length of a cylinder: ");
         r = input.nextDouble();
         l = input.nextDouble();
         area = r * r * 3.14;
         v = area * l;
         System.out.println("The area is : " +area);
         System.out.println("The volume is : " +v);
    }
}