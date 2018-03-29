import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Dragon extends Animal
{
    private GreenfootImage dragon = new GreenfootImage("Dragon.png");
    
    
    public Dragon(){
        dragon.scale(20,40);
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
            while(Math.random() > 0.10){
                whither();
            }
            success = true;
        }
        return success;
    }
    
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
    }
    
    public void reproduce(){
        if(isTouching(Starfish.class) && getLifeForce() > 50){
            World w = getWorld();
            w.addObject(new Starfish(), getX(), getY());
            while(getLifeForce() > 25){
                whither();
            }
        }
    }
}
