import java.util.Scanner;
public class Areaofhexagon {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double s;
        System.out.println("Enter the length of the side: ");
        s = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2.0 ) * s *s ;
        System.out.println("The area of the hexagon is : "+area);

}
}