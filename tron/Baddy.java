import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baddy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baddy extends Bike
{

    public Baddy(String Name, int pl) {
        super(Name,pl);
    }

    public void act(){
        if(pl == 1){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("s"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("a"))
            {
                turn(-7);
            }
        }else if(pl == 2){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("right"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("down"))
            {
                turn(-7);
            }
        }else if(pl == 3){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("v"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("c"))
            {
                turn(-7);
            }
        }else if(pl == 4){
            move(3);
            lazer();
            lazerdeath();
            if (Greenfoot.isKeyDown("m"))
            {
                turn(7);
            }
            if (Greenfoot.isKeyDown("n"))
            {
                turn(-7);
            }
        }else{

        }
    }    
}
