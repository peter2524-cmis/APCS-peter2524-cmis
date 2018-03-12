public class Roster2Driver{
    public static void main(String[] args){
        Student newStu1 = new Student("peter", "nicholson",6,1.8,4.0,4.0,4.0,4.0,4.0);
        Student newStu2 = new Student("beter", "picholson",6,1.8,4.0,4.0,4.0,4.0,4.0);
        Student newStu3 = new Student("feter", "sicholson",6,1.8,4.0,4.0,4.0,4.0,4.0);
        Roster2 apComputerScience = new Roster2();
        apComputerScience.addStudent(newStu1);
        apComputerScience.addStudent(newStu2);
        apComputerScience.addStudent(newStu3);
        System.out.println(apComputerScience);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        apComputerScience.dropStudent("nicholson");
        System.out.println(apComputerScience);
    }
}
