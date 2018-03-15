public class PeopleSimulator
{
    public static void main(String[] args){
        System.out.println("peopleProgram");        
        Teacher p = new Teacher("peter",18,"Briton");
        Pilot t = new Pilot("phil",16,"mayan");
        t.setName("ted");
        System.out.println(t.getName());
        t.setAge(34);
        t.setNationality("spaniard");
        System.out.println(t);
        System.out.println(p);
    }
}
