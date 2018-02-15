
public class Student{
    private String fname = "William";
    private String lname = "s WishWellingtons";
    private int age = 18;
    private double height = 1.90;// metres 
    private double[] grades = new double[5];
    private String[] letters = new String[5];
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
        this.grades[4] = socsci;
        this.lname = lname;
        this.age = age;
        this.height = height;
    }

    public void setGPA(double eng, double math, double sci,
    double fArts, double socSci){
        this.grades[0] = eng;
        this.grades[1] = math;
        this.grades[2] = sci;
        this.grades[3] = fArts;
        this.grades[4] = socSci;
    }

    public void letterSetter(){
        for( int x = 0; x< grades.length; x++){
            if(grades[x]>=4.0){
                letters[x] = "A";
            }else if(grades[x]>=3.7){
                letters[x] = "A-";
            }else if(grades[x]>=3.3){
                letters[x] = "B+";
            }else if(grades[x]>=3.0){
                letters[x] = "B";
            }else if(grades[x]>=2.7){
                letters[x] = "B-";
            }else if(grades[x]>=2.3){
                letters[x] = "C+";
            }else if(grades[x]>=2.0){
                letters[x] = "C";
            }else if(grades[x]>=1.7){
                letters[x] = "C-";
            }else if(grades[x]>=1.3){
                letters[x] = "D+";
            }else if(grades[x]>=1.0){
                letters[x] = "D";
            }else if(grades[x]>=.7){
                letters[x] = "D-";
            }else if(grades[x]>=.3){
                letters[x] = "f";
            }else{
                letters[x] = " dude how dumb are you";
            }
        }
    }

    public double calcGPA(){
        double gpa = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
        return gpa;
    }

    public String toString(){
        letterSetter();
        String out = "";
        out += "First Name: " +fname+"\n";
        out += "Last Name: " +lname+"\n";
        out += "Age: " +age+"\n";
        out += "Height: " +height+"\n";
        out += "Grade in English: " +grades[0]+ letters[0]+"\n";
        out += "Grade in Math: " +grades[1]+letters[1]+"\n";
        out += "Grade in Science: " +grades[2]+letters[2]+"\n";
        out += "Grade in Fine Arts: " +grades[3]+letters[3]+"\n";
        out += "Grade in Social Science: " +grades[4]+letters[4]+"\n";
        out += "GPA: "+ calcGPA();
        return out;
    }
}
