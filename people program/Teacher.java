public class Teacher extends Person
{
    public Teacher(String name,int age, String nationality){
        super(name,age,nationality);
    }
    
    public boolean eat(String food){
        boolean success = false;
        if(food == "sloppy joe"){
            setLifeForce(getLifeForce()+.05);
        }else{
            setLifeForce(getLifeForce()+.1);
        }
        return success;
    }
}
