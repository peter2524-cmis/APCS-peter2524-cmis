import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class Roster{
    private Student[] roster = new Student[3];
    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public Roster(){
        for(int x = 0; x< roster.length; x++){
            roster[x] = new Student();
        }
    }

    public Roster(String x){
        for(int i = 0; i<roster.length; i++){
            String fname = getSaltString();
            String lname = getSaltString();
            int age = 6 + (int)(Math.random() * ((18 - 6) + 1));
            double height = 1.0 + (double)(Math.random() * ((1.8 - 1) + 1.0));
            double eng = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            double math = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            double sci = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            double fArts = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            double socsci = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            roster[i] = new Student(fname,lname,age,height,eng,math ,sci,fArts,socsci );
        }
    }

    public Student findStudentWithMaxGPA(){
        Student mrSmartyPants = new Student();
        for(int i = 0; i<roster.length;i++){
            if(roster[i].calcGPA()>mrSmartyPants.calcGPA()){
                mrSmartyPants = roster[i];
            }
        }
        return mrSmartyPants;
    }
    
    public String toString(){
        String out ="";
        out+=findStudentWithMaxGPA();
        return out;
    }
}
