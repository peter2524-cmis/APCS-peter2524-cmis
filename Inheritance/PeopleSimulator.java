import java.util.*;
public class PeopleSimulator
{
    public static void main(){
        List<Person> people = new ArrayList<Person>();
        List<Organization> orgs = new ArrayList<Organization>();
        List<Payable> payables = new ArrayList<Payable>();
        int nPeople = 20;
        while(nPeople-- > 0){
            Person p;
            if(Math.random() > 0.66){
                p = new Student("Student " + nPeople, Math.random());
            } else if(Math.random() > 0.5){
                p = new Teacher("Teacher " + nPeople, Math.random());
            } else {
                p = new Doctor("Doctor " + nPeople, Math.random());
            }
            System.out.println(p);
            people.add(p);
        }

        int nOrgs = 3;
        while(nOrgs-- > 0){
            Organization o;
            if(Math.random() > 0.5){
                o = new Business("Business " + nOrgs);
            }else{
                o = new FreeClub("FreeClub " + nOrgs);
            }
            System.out.println(o);
            orgs.add(o);
        }

        for(Person person : people){
            System.out.println(person);
            if(person instanceof Payable){
                Payable payee = (Payable) person;
                payee.pay(Math.random() * 100);
                payables.add(payee);
            }else{
                System.out.println("No money for me!");
            }

        }

        for(Organization org : orgs){
            if(org instanceof Payable){
                Payable payee = (Payable) org;
                payee.pay(Math.random() * 1000);
                payables.add(payee);
            }else{
                System.out.println("We operate for the good of society!");
            }
        }

        for(Payable payable : payables){
            System.out.println(payable);
            payable.pay(Math.random() * 100);
        }
    }
}
