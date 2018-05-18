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
        boolean bl = testTL(getX(),getY());
        boolean tr = testTR(getX(),getY());
        boolean tl = testBL(getX(),getY());
        boolean br = testBR(getX(),getY());
        //facing left
        if(myWorld.rotation()>=135 && myWorld.rotation() <225){
            if(bl == true){
                myWorld.biR();
            }else if(tl == true){
                myWorld.biL();
            }
        //facing down
        }else if(myWorld.rotation()>=225 && myWorld.rotation() <315){
            if(bl == true){
                myWorld.biL();
            }else if(br == true){
                myWorld.biL();
            }
            
        }
    }

    public boolean testTL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        int i = 0;
        while(i<21){
            for(int j = 0;j<21;j++){
                if(myWorld.getObjectsAt(x+j,y+i,LazerWall.class).size()>0||myWorld.getObjectsAt(x+j,y+i,Invisilazer.class).size()>0){
                    return true;
                }
            }
            i++;
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
