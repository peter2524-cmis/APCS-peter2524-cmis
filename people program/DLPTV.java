public class DLPTV extends Television
{
   
    public DLPTV(String name,String color,String model,double price)
    {
       super(name,color,model,price); // initialise instance variables
    }    
    public String toString(){
        String out = "";
        out+="this is a DLP Screan tv";
        out+=super.toString();
        return out;
    }
}
