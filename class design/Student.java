
public class Student{
    private String fname = "William";
    private String lname = "s WishWellingtons";
    private int age = 18;
    private double height = 1.90; // metres 
    public Student(){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.height = height;
    }

    public Student(String fname, String lname, int age, double height ){
        if(fname == ""){
            this.fname = "ted";
        }else{
            this.fname = fname;
        }
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
