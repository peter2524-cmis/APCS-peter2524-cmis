public class LCDTV extends Television
{
    public LCDTV(String name,String color,String model,double price)
    {
       super(name,color,model,price); // initialise instance variables
    }    
    
    public String toString(){
        String out = "";
        out+="this is a LCD Screan tv";
        out+=super.toString();
        return out;
    }
}
