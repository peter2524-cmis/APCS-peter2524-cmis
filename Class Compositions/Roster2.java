import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.ArrayList;
public class Roster2{
    private ArrayList<Student> myStudents = new ArrayList<>();
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

    public Roster2(){
        for(int x = 0; x< myStudents.size(); x++){
            Student stu = new Student();
            myStudents.set(x,stu);
        }
    }

    // public Roster2(String x,int size){
        // for(int i = 0; i<size; i++){
            // String fname = getSaltString();
            // String lname = getSaltString();
            // int age = 6 + (int)(Math.random() * ((18 - 6) + 1));
            // double height = 1.0 + (double)(Math.random() * ((1.8 - 1) + 1.0));
            // double eng = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            // double math = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            // double sci = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            // double fArts = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            // double socsci = 0.0 + (double)(Math.random() * ((4.0 - 0) + 0));
            // Student stu = new Student(fname,lname,age,height,eng,math ,sci,fArts,socsci );
            // myStudents.set(i,stu);
        // }
    // }

    public Student findStudentWithMaxGPA(){
        Student mrSmartyPants = new Student();
        for(int i = 0; i<myStudents.size();i++){
            if(myStudents.get(i).calcGPA()>mrSmartyPants.calcGPA()){
                mrSmartyPants = myStudents.get(i);
            }
        }
        return mrSmartyPants;
    }

    public void addStudent ( Student newStudent ){
        myStudents.add(newStudent);
    }

    public void dropStudent ( String lastName ){
        boolean deleted = false;
        if(deleted == false){
            for(int i =0;i<myStudents.size();i++){
                if(myStudents.get(i).getLastName() == lastName){
                    myStudents.remove(i);
                    deleted = true;
                }
            }
        }
    }

    public String toString(){
        String out ="The student with the highest GPA was \n";
        out+=findStudentWithMaxGPA();
        out+="\n";
        out+="\n";
        out+="\n";
        out+="and the rest of the class was \n";
        for(Student s: myStudents){
            out+=s;
            out+="\n";
        }
        return out;
    }
}
