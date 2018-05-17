import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ted extends Actor
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
            myWorld.biL();
        }else if((tl == false && tr == true && bl == false && br == false)||(tl == false && tr == true && bl == false && br == true)){
            myWorld.biR();
        }else if((tl == false && tr == false && bl == false && br == true)||(tl == false && tr == false && bl == true && br == true)){ 
            myWorld.biR();
        }else if((tl == false && tr == false && bl == true && br == false)||(tl == true && tr == false && bl == true && br == false)){
        }
    }

    public boolean testTL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjectsAt(x,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+20,Invisilazer.class).size()>0){
            return true;
        }
        return false;
    }
    
    
    
    
    
    

    public boolean testTR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjectsAt(x-0,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y+20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+20,Invisilazer.class).size()>0){
            return true;
        }
        return false;
    }

    
    
    
    
    public boolean testBL(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjectsAt(x+0,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+0,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+1,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+2,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+3,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+4,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+5,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+6,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+7,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+8,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+9,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+10,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+11,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+12,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+13,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+14,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+15,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+16,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+17,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+18,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+19,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x+20,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+20,Invisilazer.class).size()>0){
            return true;
        }
        return false;
    }

    
    
    
    
    

    public boolean testBR(int x, int y){
        TheGrid myWorld = (TheGrid) getWorld();
        if(myWorld.getObjectsAt(x-0,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-0,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+0,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-1,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+1,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-2,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+2,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-3,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+3,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-4,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+4,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-5,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+5,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-6,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+6,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-7,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+7,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-8,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+8,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-9,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+9,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-10,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+10,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-11,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+11,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-12,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+12,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-13,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+13,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-14,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+14,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-15,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+15,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-16,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+16,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-17,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+17,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-18,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+18,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-19,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+19,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-0,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+0,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-1,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+1,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-2,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+2,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-3,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+3,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-4,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+4,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-5,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+5,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-6,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+6,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-7,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+7,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-8,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+8,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-9,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+9,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-10,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+10,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-11,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+11,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-12,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+12,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-13,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+13,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-14,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+14,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-15,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+15,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-16,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+16,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-17,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+17,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-18,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+18,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-19,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+19,y+20,Invisilazer.class).size()>0){
            return true;
        }
        if(myWorld.getObjectsAt(x-20,y-20,LazerWall.class).size()>0||myWorld.getObjectsAt(x+20,y+20,Invisilazer.class).size()>0){
            return true;
        }

        return false;
    }

}
