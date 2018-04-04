import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Dragon extends Animal
{
    private GreenfootImage dragon = new GreenfootImage("tenor.gif");

    public Dragon(){
        dragon.scale(80,80);
        setImage(dragon);       
    }

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
            Starfish Starfish = (Starfish) food;
            int nutrition = Starfish.getLifeForce();
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        }
        return success;
    }

    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 10);
         if(getLifeForce() <=10){
            drink();
        }      
    }

    public void reproduce(){
        if(isTouching(Dragon.class) && getLifeForce() > 75){
            World w = getWorld();
            w.addObject(new egg(), getX(), getY());

            nosex(getLifeForce());
        }
    }

    public int nosex(int x){
        if(x<=74){
            return getLifeForce();
        }else{
            whither();
            int newlife = getLifeForce();
            return(nosex(newlife));
        }
    }
    
     public void drink(){
        turn(30 - (int)(Math.random() * 600));
        move(200);
    }
}
