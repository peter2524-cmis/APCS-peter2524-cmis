
/**
 * Write a description of class Fundamentals1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        int intone = 3;
        int inttwo = 5;
        int sum = intone + inttwo;
        System.out.print("The sum of these two numbers("+intone+"and"+inttwo+"is"+sum);
    } return sum

}