import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the border wants to do. This method is called whenever
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
        boolean tl = testTL(getX(),getY());
        boolean tr = testTR(getX(),getY());
        boolean bl = testBL(getX(),getY());
        boolean br = testBR(getX(),getY());

        if((tl == true && tr == false && bl == false && br == false)||(tl == true && tr == true && bl == false && br == false)){
            myWorld.biR();
        }else if((tl == false && tr == true && bl == false && br == false)||(tl == false && tr == true && bl == false && br == true)){
            myWorld.biR();
        }else if((tl == false && tr == false && bl == false && br == true)||(tl == false && tr == false && bl == true && br == true)){ 
            myWorld.biL();
        }else if((tl == false && tr == false && bl == true && br == false)||(tl == true && tr == false && bl == true && br == false)){
        }
    }    

    public boolean testTL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        for(int i = 0; i<21;i++){
            for(int j = 0;j<21;j++){
                if(myWorld.getObjectsAt(x+j,y+i,LazerWall.class).size()>0||myWorld.getObjectsAt(x+j,y+i,Invisilazer.class).size()>0){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean testTR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        for(int i = 0; i<21;i++){
            for(int j = 0;j<21;j++){
                if(myWorld.getObjectsAt(x-j,y+i,LazerWall.class).size()>0||myWorld.getObjectsAt(x-j,y+i,Invisilazer.class).size()>0){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean testBL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        for(int i = 0; i<21;i++){
            for(int j = 0;j<21;j++){
                if(myWorld.getObjectsAt(x+j,y-i,LazerWall.class).size()>0||myWorld.getObjectsAt(x+j,y-i,Invisilazer.class).size()>0){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean testBR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        for(int i = 0; i<21;i++){
            for(int j = 0;j<21;j++){
                if(myWorld.getObjectsAt(x-j,y-i,LazerWall.class).size()>0||myWorld.getObjectsAt(x-j,y-i,Invisilazer.class).size()>0){
                    return true;
                }
            }
        }
        return false;
    }
}
