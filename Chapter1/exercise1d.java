public class exercise1d {
    public static void main(String[]args){
        double p = 312032486.0, y = 5.0;
        double t = (365 * y)* 24 * 60 * 60;
        double birth = t / 7.0;
        double death = t / 13.0;
        double imm = t / 45.0;
        double pp = ((p + birth + imm) - death) ;
        System.out.println("After 5 years the population is : "+pp);
    }

}