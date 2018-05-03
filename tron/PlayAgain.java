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
    /**
     * Act - do whatever the playAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(x == 3){
            if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(new Dudgrid(4));
            }
        }    
    }
}
