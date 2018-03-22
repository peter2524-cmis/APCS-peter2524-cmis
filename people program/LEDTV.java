public class LEDTV extends Television
{
    public LEDTV(String name,String color,String model,double price)
    {
       super(name,color,model,price); // initialise instance variables
    }    
    public String toString(){
        String out = "";
        out+="this is a LED Screan tv";
        out+=super.toString();
        return out;
    }
}
