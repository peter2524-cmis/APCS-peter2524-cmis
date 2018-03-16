public class Pilot extends Person
{    
    public Pilot(String name,int age, String nationality){
        super(name,age,nationality);
    }

    public boolean eat(String food){
        boolean success = false;
        if(food == "Airplane Food"){
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
