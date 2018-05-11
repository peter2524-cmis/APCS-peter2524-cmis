import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    private boolean[] turnVals = new boolean[4];
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
            myWorld.bL();
        }else if((tl == false && tr == true && bl == false && br == false)||(tl == false && tr == true && bl == false && br == true)){
            myWorld.bR();
        }else if((tl == false && tr == false && bl == false && br == true)||(tl == false && tr == false && bl == true && br == true)){ 
            myWorld.bR();
        }else if((tl == false && tr == false && bl == true && br == false)||(tl == true && tr == false && bl == true && br == false)){
        }
    }

    public boolean testTL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        
        if(x<= getX()+20&&y<=getY()+20){
            
            if(myWorld.getObjectsAt(x,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x,y,Invisilazer.class).size()>0){
                System.out.println(x);
                return true;
            }else{
                if(x==getX()+20){
                    return testTR(x-20,y+1);
                    
                }else{

                    return testTR(x+1,y);
                    
                }
            }
        }else{
            return false;
        }
    }

    public boolean testTR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(x<= getX()-20&&y<=getY()+20){
            if(myWorld.getObjectsAt(x,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x,y,Invisilazer.class).size()>0){
                return true;
            }else{
                if(x==getX()-20){
                    return testTR(x-20,y+1);
                }else{
                    return testTR(x-1,y);
                }
            }
        }else{
            return false;
        }
    }

    public boolean testBL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(x<= getX()+20&&y<=getY()-20){
            if(myWorld.getObjectsAt(x,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x,y,Invisilazer.class).size()>0){
                return true;
            }else{
                if(x==getX()+20){
                    return testTR(x+20,y-1);
                }else{
                    return testTR(x+1,y);
                }
            }
        }else{
            return false;
        }
    }

    public boolean testBR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(x<= getX()-20&&y<=getY()-20){
            if(myWorld.getObjectsAt(x,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x,y,Invisilazer.class).size()>0){
                return true;
            }else{
                if(x==getX()-20){
                    return testTR(x-20,y-1);
                }else{
                    return testTR(x-1,y);
                }
            }
        }else{
            return false;
        }
    }

}
