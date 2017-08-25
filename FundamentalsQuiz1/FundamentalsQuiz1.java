public class FundamentalsQuiz1
{
    public static int squares(int a, int b){
        int s1= a*a;
        int s2= b*b;
        int end= s1+s2;
        return end;
    }
    
    public static double DismalDecimals(double a, double b, double c){
        double divide= (a + b +c)/3.0;
        return divide;
    }
    
    public static void main(String[] args){
        int squadd= squares(32,81);
        System.out.println(squadd);
        
        double thedivided= DismalDecimals(4.2,4.20,6.9);
        System.out.println(thedivided);

    }
    
    /*
     * #1 Write a method that returns the sum of the squares 
     * of 2 whole numbers given as arguments.
     * 
     * #2 Call the method from the main method. The call
     * should get its arguments from variables declared 
     * in the main method.
     */
    
    /*
     * #3 Write a method that returns the average of 3 decimals
     * given as arguments.
     * 
     * #4 Call the method from the main method. The call should get its 
     * arguments from variables declared in the main method.
     */

}