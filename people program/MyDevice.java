public abstract class MyDevice
{
   private String name;
   private String color;
   public void setName(String newName){
       name = newName;
   }
   
   public void setColor(String newColor){
       color = newColor;
   }
   
   public MyDevice(String name,String color){
       this.name = name;
       this.color = color;
    }
    
    public String toString(){
        String out = "";
        out+="The name of this "+color+" device is "+name+"\n";
        return out;
    }
}
