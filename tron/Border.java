import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the Border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()     
    {
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjects(Baddy.class).size()>0){
            int x = myWorld.bX();
            int y = myWorld.bY();
            setLocation(x,y);

        }
    }    
    
    public void test(){
        TheGrid myWorld = (TheGrid) getWorld();
        if(isTouching(LazerWall.class) == true|| isTouching(Invisilazer.class) == true){
            for(int x = getX()-10; x < getX();x++){
                for(int y = getY()-10;y<getY();y++){
                    int[] Tright = myWorld.getObjectsAt(x,y,LazerWall.class).size();                        
                }
            }
        }else{
        }
    }
}
