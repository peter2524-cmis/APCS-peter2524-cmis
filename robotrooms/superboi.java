import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class superboi extends Robot
{
    public superboi(){
        super(Color.red);
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
            if(getX()> 2){
                if(isClearLeft()==false){
                    up();
                }else{
                    left();
                }
            }
            else if(getX()< 2){
                if(isClearRight()==false){
                    up();
                }else{
                    right();
                }
            }
            else{
                setData(0,1);
            }
        }
        else if(getData(0) == 1){
            if(getY()> 2){
                up();
            }
            else if(getY()< 2){
                down();
            }
            else{
                setData(0,2);
            }
        }
        else if(getData(0) == 2){
            if(isClearRight()== true){
                right(); 
            }else{
                setData(1,(getX()-1));
                setData(0,3);
            }
        }
        else if(getData(0) == 3){
            if(getX()>2){
                left();
            }else{
                setData(0,5);
            }
        }                
        else if(getData(0) == 5){
            if(getY()>2){
                up();
            }else{
                setData(0,6);
            }
        }
        else if(getData(0) == 6){

            if(getY()%2 == 0){
                if(isClearRight() == false){
                    //gena stuff
                    setData(0,7);
                }
                else{
                    if(getX() == getData(1)){
                        down();
                    }else{
                        right();
                    }
                }
            }else if(getY()%2 == 1){
                if(isClearLeft() == false){
                    //gena stuff
                    setData(0,62);
                    up();
                }
                else{
                    if(getX() == 2){
                        down();
                    }else{
                        left();
                    }
                }
            }             
        }
        else if(getData(0) == 62){
            if(getY()%2 == 1){
                if(isClearRight() == false){
                    //gena stuff
                    setData(0,7);
                }
                else{
                    if(getX() == getData(1)){
                        down();
                    }else{
                        right();
                    }
                }
            }else if(getY()%2 == 0){
                if(isClearLeft() == false){
                    //gena stuff
                    setData(0,62);
                    up();
                }
                else{
                    if(getX() == 2){
                        down();
                    }else{
                        left();
                    }
                }
            }             
        }
        else if(getData(0) == 7){
            if(getData(2) <= 10){
                if(isClearRight() == false){
                    setData(2,getData(2)+1);
                    if(isClearRight() == false){
                        down();
                    }else{
                        if(isClearDown() == true){
                            setData(3,1);
                        }else{
                            setData(3,2);
                        }
                    }
                }else{
                    if(getData(3) == 0){
                        setData(3,2);
                    }
                    else if(getData(3) == 2){
                        setData(3,3);
                        right();
                    }else if(getData(3) == 3){
                        setData(3,4);
                        right();
                    }else if(getData(3) == 4){
                        if(isClearUp() == true){
                            up();
                        }
                        else{
                            if(getX()%2 == 0){
                                setData(3,5);
                            }else{
                                setData(3,6);
                            }
                        }

                    }else if(getData(3) == 5){
                        if(getX()%2 == 0){
                            if(isClearDown() == true){
                                down();
                            }else{
                                right();
                            }
                        }else{
                            if(isClearUp() == true){
                                up();
                            }else{
                                right();
                            }
                        }
                    }else if(getData(3) == 6){
                        if(getX()%2 == 1){
                            if(isClearDown() == true){
                                down();
                            }else{
                                right();
                            }
                        }else{
                            if(isClearUp() == true){
                                up();
                            }else{
                                right();
                            }
                        }
                    }
                }
            }
            else{
                setData(2,-1);
                setData(0,8);
            }
        }else if(getData(0) == 8){
            if(getData(2) <= 10){
                if(isClearRight() == false){
                    setData(2,getData(2)+1);
                    if(isClearRight() == false){
                        down();
                    }else{
                        if(isClearDown() == true){
                            setData(3,1);
                        }else{
                            setData(3,2);
                        }
                    }
                }else{
                    if(getData(3) == 0){
                        setData(3,2);
                    }
                    else if(getData(3) == 2){
                        setData(3,3);
                        right();
                    }else if(getData(3) == 3){
                        setData(3,4);
                        right();
                    }else if(getData(3) == 4){
                        if(isClearUp() == true){
                            up();
                        }
                        else{
                            if(getX()%2 == 0){
                                setData(3,5);
                            }else{
                                setData(3,6);
                            }
                        }

                    }else if(getData(3) == 5){
                        if(getX()%2 == 0){
                            if(isClearDown() == true){
                                down();
                            }else{
                                right();
                            }
                        }else{
                            if(isClearUp() == true){
                                up();
                            }else{
                                right();
                            }
                        }
                    }else if(getData(3) == 6){
                        if(getX()%2 == 1){
                            if(isClearDown() == true){
                                down();
                            }else{
                                right();
                            }
                        }else{
                            if(isClearUp() == true){
                                up();
                            }else{
                                right();
                            }
                        }
                    }
                }
            }
            else{
                setData(2,-1);
                setData(0,8);
            }
        }
        System.out.println(getData(0)+"this is zero");
        System.out.println(getData(2)+"this is two");
        System.out.println(getData(3)+"this is three");
    }
}

