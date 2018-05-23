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
            wallturn();

        }
        boolean bl = testTL(getX(),getY());
        boolean tr = testTR(getX(),getY());
        boolean tl = testBL(getX(),getY());
        boolean br = testBR(getX(),getY());

        if(bl||tr||tl||br == true){
            //facing left
            if(myWorld.rotation()>=135 && myWorld.rotation() <225){
                if(bl == true){
                    myWorld.biR();
                }else if(tl == true){
                    myWorld.biL();
                }
                //facing up
            }else if(myWorld.rotation()>=225 && myWorld.rotation() <315){
                if(tl == true){
                    myWorld.biL();
                }else if(tr == true){
                    myWorld.biR();
                }
                //facing right
            }else if(myWorld.rotation()>=315|| myWorld.rotation() >=0 &&myWorld.rotation()< 45){
                if(tr == true){
                    myWorld.biR();
                }else if(br == true){
                    myWorld.biL();
                }
                //facing down
            }else{
                if(br == true){
                    myWorld.biL();
                }else if(bl == true){
                    myWorld.biR();
                }

            }
            //System.out.println(myWorld.rotation());
        }else{
            if (Greenfoot.isKeyDown("s"))
            {
                myWorld.biR();
            }
            if (Greenfoot.isKeyDown("a"))
            {
                myWorld.biL();
            }
        }
    }

    public void wallturn(){
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjects(Baddy.class).size()>0){
            int wr = myWorld.getW()-20;
            int hd = myWorld.getH()-20;
            if(getX() <= 20){
                if(myWorld.rotation()>=90 && myWorld.rotation() <180){
                    myWorld.biL();
                }else if(myWorld.rotation()>=180 && myWorld.rotation() <270){
                    myWorld.biR();
                }
            }
            if(getX() > wr){
                if(myWorld.rotation()>=270 && myWorld.rotation() <359){
                    myWorld.biL();
                }else if(myWorld.rotation()>=359||myWorld.rotation()>=0 && myWorld.rotation() <90){
                    myWorld.biR();
                }
            }
            if(getY() <= 20){
                if(myWorld.rotation()>=180 && myWorld.rotation() <270){
                    myWorld.biL();
                }else if(myWorld.rotation()>=270||myWorld.rotation()>=0 && myWorld.rotation() <359){
                    myWorld.biR();
                }
            }
            if(getY()>hd){
                if(myWorld.rotation()>=0 && myWorld.rotation() <90){
                    myWorld.biL();
                }else if(myWorld.rotation()>=90||myWorld.rotation()>=0 && myWorld.rotation() <180){
                    myWorld.biR();
                }
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
