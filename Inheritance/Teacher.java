public class Teacher extends Person implements Payable
{
    private double teachingAbility;
    private double money;
    public Teacher(String name, double teachingAbility){
        super(name);    
        this.teachingAbility = teachingAbility;
    }
    
    public boolean teach(Student student, String lesson){
        boolean success = false;
        if(Math.random() > teachingAbility){
            success = student.learn(lesson);
            
        }
        return success;
    }
    
    
    public boolean eat(String food){
        boolean success = false;
        if (food.equals("pizza")){
            setLifeForce(getLifeForce() + 0.2);
            success = true;
        } else if (food.equals("horse meat")){
            setLifeForce(getLifeForce() - 0.1);
        }else{
            
            setLifeForce(getLifeForce() + 0.1);
            success = true;
        }
        return success;
            
    }

    public boolean move(int dx, int dy){
        if( dx < 3 && dy < 3){
            super.move(dx, dy);
            return true;
        }else{
            return false;
        }
    }
    
    public void pay(double wage){
        money += wage *  2;
        System.out.println("Got me some kizzash! Woooooooot!");
    }
}
