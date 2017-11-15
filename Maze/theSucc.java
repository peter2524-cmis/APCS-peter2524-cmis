import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class theSucc extends Robot
{
    public theSucc(int d){
        super(Color.blue, d);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        System.out.println(getData(0));
        if(getData(0) == 0){
            side1();
        }else if(getData(0) == 1){
            side2();
        }else if(getData(0) == 2){
            side3();
        }else if(getData(0) == 3){
            side4();
        }
    }

    public void side1(){
        if(getData(0) == 0){
            if(!isClearLeft() && !isClearUp()){
                setData(0,1);
            }else if(!isClearLeft() && isClearUp() == true){
                up();
            }else if(isClearLeft() == true&& !isClearUp()){
                setData(0,3);
                left();
            }
        }
    }

    public void side2(){
        if(getData(0) == 1){
            if(!isClearUp() && !isClearRight()){
                setData(0,2);
            }else if(!isClearUp() && isClearRight() == true){
                right();
            }else if(isClearUp() == true && !isClearRight()){
                setData(0,0);
                up();
            }
        }
    }

    public void side3(){
        if(getData(0) == 2){
            if(!isClearRight() && !isClearDown()){
                setData(0,3);
            }else if(!isClearRight() && isClearDown() == true){
                down();
            }else if(isClearRight() == true && !isClearDown()){
                setData(0,1);
                right();
            }
        }
    }

    public void side4(){
        if(getData(0) == 2){
            if(!isClearDown() && !isClearLeft()){
                setData(0,1);
            }else if(!isClearDown() && isClearLeft() == true){
                left();
            }else if(isClearDown() == true && !isClearLeft()){
                setData(0,2);
                down();
            }
        }
    }
}
