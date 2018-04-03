public abstract class Organization
{
    private String name;
    public Organization(String name){
        this.name = name;
    }
    
    public String getOrgName(){
        return name;
    }
    
    public abstract void operate();
    
    public String toString(){
        return "I'm a " + getClass().getName() + ". My name is " + name;
    }
}
