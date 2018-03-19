public class Teacher extends Person
{
    private double teachingpower;
    public Teacher(String name,int age, String nationality, double teachingpower){
        super(name,age,nationality);
        this.teachingpower = teachingpower;
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
    
    public String applyHat(String newHat){
        if(newHat.equals("pilot hat")){
            super.applyHat(newHat);      
        }else{
            super.setInHat(false);
            newHat = "your head shall remain nude until you choose the right hat for the job";
        }
        return newHat;
    }
}
