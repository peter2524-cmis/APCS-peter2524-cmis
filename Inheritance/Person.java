public abstract class Person
{
    private String name = "Generic Person Name"; 
    private double lifeForce;
    private int x;
    private int y;
    public Person(String name){
        this.name = name;
        this.lifeForce = Math.random();
        this.x = 0;
        this.y = 0;
    }
    
    public double getLifeForce(){
        return lifeForce;
    }
    
    public void setLifeForce(double newLifeForce){
        this.lifeForce = newLifeForce;
    }
    // returns true if instance ate successfully
    public abstract boolean eat(String food);
    
    public boolean move(int dx, int dy){
        this.x += dx;
        this.y += dy;
        return true;
    }
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String toString(){
        return "I'm a " + getClass().getName() +". My name is " + this.name + ". ";
    }
    
}
