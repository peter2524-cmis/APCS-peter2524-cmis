public abstract class Person
{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String nationality;
    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    
    private double lifeForce;
    public double getLifeForce(){
        return lifeForce;
    }
        
    public void setLifeForce(double newLifeForce){
        this.lifeForce = newLifeForce;
    }
    
    public abstract boolean eat(String food);
   
    
    public Person(String name,int age,String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.lifeForce = .5;
    }
    
    public String toString(){
        String out = "";
        out+="This person is a "+age+" year old "+nationality+" whos name is "+name+"\n";
        return out;
    }

}
