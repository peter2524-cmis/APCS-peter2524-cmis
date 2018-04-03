import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class egg extends Animal implements RedBull
{
      public boolean eat(Actor food){
        boolean success = false;
        if(food instanceof Chicken){
            Chicken Chicken = (Chicken) food;
            int nutrition = Chicken.getNutrition();
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        } else if (food instanceof Starfish){
            while(Math.random() > 0.10){
                whither();
            }
            success = true;
        }
        return success;
    }
    
    public void changePosition(){
        if(Math.random() > 0.99){
            turn(30 - (int)(Math.random() * 60));
        }
        move(0);
    }
    
    public void reproduce(){
        if (getLifeForce() == 1){
            whither();
            World w = getWorld();
            w.addObject(new Dragon(), getX(), getY());            
        }
    }
    
    public void drink(){
        turn(30 - (int)(Math.random() * 600));
        move(70);
    }
}
