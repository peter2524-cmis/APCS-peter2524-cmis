
public class Doctor extends Person implements Payable
{
    
    private double healAbility;
    private double money;
    public Doctor(String name, double healAbility){
        super(name);
        this.healAbility = healAbility;
    }
    
    public boolean eat(String food){
        setLifeForce(getLifeForce() + 0.1);
        return true;
    }
    
    public boolean heal(Person person){
        double health = 0.0;
        while(Math.random() <= healAbility){
            health += 0.1;
        }
        person.setLifeForce(person.getLifeForce() + health);
        
        return health > 0.0;
    }
    
    public void pay(double wage){
        money += wage;
        System.out.println("It was an honor to take your money!");
    }
}
