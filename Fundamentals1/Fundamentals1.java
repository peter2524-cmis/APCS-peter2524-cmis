
/**
 * Write a description of class Fundamentals1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Fundamentals1{
    public static void intstuff(){
        int theintvariable = 73456758;
        String nln=("\n");
        String intdescriptionanduse = ("The int is a numerical datatype that ends without ever having a dicimal.\n"
                +"its maximum value is 2,147,483,647 and its minimum value is -2,147,483,648. these are both\n"
                +"determined by its bit count witch is 32. You could probably use this to represent anything that \n"
                +" can be counted for example a list of items that you would never purchase a decimal of ,like apples \n"
                +"it could be used on a grocery list");
        String examples=("Could Be used for:\n"
                +"Ball Bearings that are beeing inventoried\n"
                +"number of feathers used by a pillow company\n"
                +"Fields in america");

        System.out.print("The int variable is "+theintvariable+" "+intdescriptionanduse+nln+examples);
    }

    public static void charstuff(){
        char thenumberf = 'f';
        String nln=("\n");
        String chardescription = ("the trouble as I see it is finding the differance between \n"
                +"a string and a char. The differance is that a char is a single letter and uses single\n"
                +"quote symbols wereas a string can have zero or multiple characters. The char could be\n"
                +"used in a setting were multiple options were given to somone to make a choice and each of\n"
                +"them were given a char value to make the text faster to read");
        String examples=("Could Be used for:\n"
                +"Answers on a test\n"
                +"Possible Choices\n"
                +"the worlds worst password");

        System.out.print("The char variable is "+thenumberf+" "+chardescription+nln+examples);
    }

    public static void bytestuff(){
        byte bytevariable = 24;
        String nln=("\n");
        String bytedescription = ("this is used to save space in a program by replacing the intager becuase this is 4 times smaller");
        String examples=("Could Be used for:\n"
                +"number of computers a school is buying\n"
                +"Volume settings\n"
                +"some dudes age");
        System.out.print("The byte variable is "+bytevariable+" "+bytedescription+nln+examples);
    }

    public static void shortstuff(){
        short shortvariable= 420;
        String nln=("\n");
        String shortdescription = ("The short is half the size of an int, its maximum value is 32767 and its minimum value is -32768");
        String examples=("Could Be used for:\n"
                +"number of pages in an encyclopedia\n"
                +"combined age of malta\n"
                +"hairs on my head");
        System.out.print("The short variable is "+shortvariable+" "+shortdescription+nln+examples);
    }

    public static void longstuff(){
        short longvariable= 420;
        String nln=("\n");
        String longdescription = ("The long is twice size of an int, its maximum value is 9,223,372,036,854,775,807 and its minimum value is -9,223,372,036,854,775,808");
        String examples=("Could Be used for:\n"
                +"number of ants in a small town\n"
                +"combined age of the world\n"
                +"atoms in a baseball");
        System.out.print("The long variable is "+longvariable+" "+longdescription+nln+examples);
    }

    public static void Floatstuff(){
        float Floatvariable= 2.5f;
        String nln=("\n");
        String Floatdescription = ("The float is the same  size of an int, it can be used to display decimals");
        String examples=("Could Be used for:\n"
                +"average age of priests\n"
                +"average cornflakes in a box\n"
                +"weight of a twig in pounds");
        System.out.print("The long variable is "+Floatvariable+" "+Floatdescription+nln+examples);
    }

    public static void Doublestuff(){
        double Doublevariable= 42.9;
        String nln=("\n");
        String Doubledescription = ("The Double is twice the size of an int, it can be used to display decimals");
        String examples=("Could Be used for:\n"
                +"Number of people who died during the 1st world war(children are decimals)\n"
                +"Average number of components found in a computer\n"
                +"how many legs there are in the world");
        System.out.print("The long variable is "+Doublevariable+" "+Doubledescription+nln+examples);
    }

    public static void Booleanstuff(){
        boolean booleanvariable = false;
        String nln=("\n");
        String booleandescription = ("The Boolean is the smallest of the primative data types, it can display a single 1 or a single 0(thsese are both shown as true or false)");
        String examples=("Could Be used for:\n"
                +"Number of people who died during the 1st world war(children are decimals)\n"
                +"Average number of components found in a computer\n"
                +"how many legs there are in the world");
        System.out.print("The long variable is "+booleanvariable+" "+booleandescription+nln+examples);
    }

    public static int add(int a, int b){
        int isum = a + b;
        return isum;
    }

    public static int sub(int a, int b){
        int idif = a - b;
        return idif;
    }

    public static int mul(int a, int b){
        int iprod = a * b;
        return iprod;
    }

    public static int div(int a, int b){        
        int iquo = a / b;
        return iquo;
    }

    public static double add(double a, double b){
        double dsum = a + b;
        return dsum;
    }

    public static double sub(double a, double b){
        double ddif = a - b;
        return ddif;
    }

    public static double mul(double a, double b){
        double dprod = a * b;
        return dprod;
    }

    public static double div(double a, double b){        
        double dquo = a / b;
        return dquo;
    }

    public static void compare(int a, int b){
        if (a>b)
        {System.out.print("The value of a is "+ a + " and it is greater than b whose value is "+ b);
        }
        if (a<b)
        {System.out.print("The value of a is "+ a + " and it is less than b whose value is "+ b);
        }
        if (a==b)
        {System.out.print("The value of a is "+ a + " and it is twice as equal as b whose value is "+ b);
        }
    }

    public static int evenOddZero(int a){
        int g = 0;
        if (a==0)
        {g = 0;
        }
        if ((a%2)==0)
        {g = 1;
        }
        if ((a%2)==1)
        {g = -1;
        }
        return g;
    }

    public static void squareTable(int starter){
        for(starter = 1; starter<11; starter++){
            int square = starter * starter;
            int random = (int)(Math.random()*(square-starter))+starter;
            System.out.println("the starter was: "+starter+"The square was :"+square+" and the random was"+random);
        }
    }

    public static void triangle(int triangle){
        int answer = 0;
        for(triangle = 9; triangle>0; triangle--){
            answer = triangle + answer;
            System.out.println("Current answer is "+answer);
        }
        System.out.println("the final answer is "+answer);
    }

    public static void pyramid(int triangle){
        int answer = 0;
        for(triangle = 9; triangle>0; triangle--){
            answer = (triangle*triangle)+answer;
            System.out.println("Current answer is "+answer);
        }
        System.out.println("the final answer is "+answer); 
    }

    public static void checkerboard(int rows, int cols){
        System.out.println("Rows: "+rows+" and Columns: "+cols);
        rows = rows +1;
        int rowfind = (int)(Math.random()*(rows))+1;
        int colfind = (int)(Math.random()*(cols))+1;{
            if (rowfind%2==0){
                colfind=colfind+1;
            }
            else if ((rowfind%2==0)&&(colfind==cols)){
                colfind=colfind-1;
            }
            else if (colfind==0){
                colfind=colfind+2;
            }
        }
        int randomint = (int)(Math.random()*(9))+0;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++)  

                if((j%2==1 && i%2==1) || (j%2==0 && i%2==0)){
                    if ((j==rowfind) && (i==colfind)){
                        System.out.print(randomint);
                    }
                    else{

                        if (j==1){
                            System.out.print("|");
                        }
                        System.out.print("#");
                    }
                }
                else if (i==1){
                    if (i==1){
                        System.out.print(" ");
                        
                    }
                    
                }
                else{

                    if (j==1){
                        System.out.print("|");
                    }
                    System.out.print(" ");
                }
            System.out.println("|");
        }
    }

    public static void main(){
        int reisum = add (5,7);
        int reiprod = mul (5,7);
        System.out.print("the results for the multiplication and addition of the ints are "+reiprod+" and "+reisum);
        double redsum = add(4,9);
        double redprod = mul(4,9);
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an int you would like to have subtracted from and divided ");
        int ibasesubdiv = reader.nextInt();
        System.out.println("enter the other half of this problem");
        int iotherhalf = reader.nextInt();
        System.out.println("You entered the numbers " +ibasesubdiv+" and "+iotherhalf);
        int reidif = sub(ibasesubdiv,iotherhalf);
        int reiquo = div(ibasesubdiv,iotherhalf);
        System.out.print("the results for the subtraction and division of the ints are "+reidif+" and "+reiquo);
        System.out.println("Enter an double you would like to have subtracted from and divided ");
        int dbasesubdiv = reader.nextInt();
        System.out.println("enter the other half of this problem");
        int dotherhalf = reader.nextInt();
        System.out.println("You entered the numbers " +dbasesubdiv+" and "+dotherhalf);
        double reddif = sub(dbasesubdiv,dotherhalf);
        double redquo = div(dbasesubdiv,dotherhalf);
        System.out.print("the results for the subtraction and division of the doubles are "+reidif+" and "+reiquo);

        compare(4, 54);
        int eoz=0; 
        eoz= evenOddZero(67);
        System.out.print("0 represents the number was 0, 1 represents the number was even -1 represents the number was odd the number is "+eoz);
    }

}
