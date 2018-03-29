import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Chicken extends Fruit
{
    private GreenfootImage chicken = new GreenfootImage("chicken.png");
    public Chicken(){
        super(750);
        chicken.scale(50,50);
        setImage(chicken);
        
    }
    
    public void rot(){
        if(Math.random() > 0.1){
            decFreshness();
        }
    }
}