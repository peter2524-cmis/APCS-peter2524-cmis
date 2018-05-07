import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Inst
{
    private int x;
    public PlayAgain(int x){
        this.x = x;
    }

    public void act() 
    {
        if(x == 4){
            if(Greenfoot.isKeyDown("y") == true){
                Greenfoot.setWorld(new DudgridB(4));
            }else if(Greenfoot.isKeyDown("n") == true){
                Greenfoot.setWorld(new StartMenu());
            }
        }
        else if(x == 3){
            if(Greenfoot.isKeyDown("y") == true){
                Greenfoot.setWorld(new DudgridB(3));
            }else if(Greenfoot.isKeyDown("n") == true){
                Greenfoot.setWorld(new StartMenu());
            }
        }else if(x == 2){
            if(Greenfoot.isKeyDown("y") == true){
                Greenfoot.setWorld(new DudgridB(2));
            }else if(Greenfoot.isKeyDown("n") == true){
                Greenfoot.setWorld(new StartMenu());
            }
        }else{
            if(Greenfoot.isKeyDown("y") == true){
                Greenfoot.setWorld(new DudgridB(1));
            }else if(Greenfoot.isKeyDown("n") == true){
                Greenfoot.setWorld(new StartMenu());
            }
        }
    }
}
