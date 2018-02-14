
public class Student{
    private String fname = "William";
    private String lname = "s WishWellingtons";
    private int age = 18;
    private double height = 1.90;// metres 
    private double[] grades = new double[5];
    public Student(){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.height = height;
        this.grades[0] = 0.0;
        this.grades[1] = 0.0;
        this.grades[2] = 0.0;
        this.grades[3] = 0.0;
        this.grades[4] = 0.0;
    }

    public Student(String fname, String lname, int age, double height, double eng,
    double math , double sci, double fArts, double socsci ){
        if(fname == ""){
            this.fname = "ted";
        }else{
            this.fname = fname;
        }
        this.grades[0] = eng;
        this.grades[1] = math;
        this.grades[2] = sci;
        this.grades[3] = fArts;
        this.grades[4] = socsci
        this.lname = lname;
        this.age = age;
        this.height = height;
    }
    public String toString(){
        String out = "";
        out += "First Name: " +fname+"\n";
        out += "Last Name: " +lname+"\n";
        out += "Age: " +age+"\n";
        out += "Height: " +height+"\n";
        return out;
    }
}
