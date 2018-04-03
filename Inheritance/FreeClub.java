
public class FreeClub extends Organization
{
    public FreeClub(String name){
        super(name);
    }
    
    public void operate(){
        System.out.println(getOrgName() + " is a free club and is extremely clubbish.");
    }
}
