public class PlasmaTV extends Television{   
    public PlasmaTV(String name,String color,String model,double price)
    {
       super(name,color,model,price); // initialise instance variables
    }    
    
    public String toString(){
        String out = "";
        out+="this is a Plasma Screan tv";
        out+=super.toString();
        return out;
    }
}
