public abstract class Person
{
    private String name;
    private int age;
    public String nationality;
    private double lifeForce;
    private boolean inHat;
    
    public Person(String name,int age,String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.lifeForce = .5;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    
    
    public double getLifeForce(){
        return lifeForce;
    }        
    public void setLifeForce(double newLifeForce){
        this.lifeForce = newLifeForce;
    }
    
    public boolean getInHat(){
        return inHat;
    }
    public void setInHat(boolean inHat){
        this.inHat = inHat;
    }
    public abstract boolean eat(String food);
   
    public String applyHat(String newHat){
        inHat= true;
        return newHat;
    }
    
    public String toString(){
        String out = "";
        out+="This person is a "+age+" year old "+nationality+" whos name is "+name+"\n";
        return out;
    }

}
