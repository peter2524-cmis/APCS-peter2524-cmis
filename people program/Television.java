public abstract class Television extends MyDevice
{
    private String model;
    private double price;
    public Television(String name,String color,String model,double price){
        super(name,color);
        this.price = price;
        this.model = model;
    }
    
    public String toString(){
        String out = "";
        out+=super.toString();
        out+="its model is "+model+" and it costs "+price+"\n";
        return out;
    }
}
