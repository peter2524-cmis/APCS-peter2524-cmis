
/**
 * Write a description of class Fundamentals1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundamentals{
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
}
