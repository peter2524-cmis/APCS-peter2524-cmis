public class Flashlight
{
    private boolean isOn = false;

    private String lightColor = "white";

    private int intensity = 2;

    public String toString(){
        String out = "";
        if(isOn){
            out += "There is a ";
            out += new String[]{"extremely dim","dim", "medium", "bright"," retina searingly bright"}[intensity] + " ";
            out += lightColor + " light";
            out += " emanating from the flashlight.";
        }else{
            out = "The flashlight is off.";
        }
        return out;
    }       

    public void toggle(){
        if(isOn == false){
            this.isOn = true;
        }else{
            this.isOn = false;
        }
    }

    public void changeColor(String newcolor){
        if(newcolor ==("red")||newcolor==("white")||newcolor ==("blue")||newcolor ==("yellow")){
            this.lightColor = newcolor;
        }else{
        }

    }

    public void incIntensity(){
        if(intensity<4){
            intensity+=1;
        }else{
        }
    }

    public void decIntensity(){
        if(intensity>0){
            intensity-=1;
        }else{
        }
    }

    public String getIntensityDescription(){
        if(intensity == 0){
            return "extremely dim";
        }else if(intensity == 1){
            return "dim";
        }else if(intensity == 2){
            return "medium";
        }else if(intensity == 3){
            return "bright";
        }else{
            return "retina searingly bright";
        }
    }

    public static void main(String[] args){
        Flashlight fl = new Flashlight();
        System.out.println(fl);   
        System.out.println("\nTest toggle\n===========");
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();
        System.out.println(fl);
        fl.toggle();

        System.out.println("\nTest changeColor\n================");
        fl.changeColor("red");
        System.out.println(fl);

        fl.changeColor("blue");
        System.out.println(fl);

        fl.changeColor("yellow");
        System.out.println(fl);

        fl.changeColor("white");
        System.out.println(fl);

        fl.changeColor("green");
        System.out.println(fl);

        fl.changeColor("orange");
        System.out.println(fl);

        System.out.println("\nTest getIntensity, decIntensity, incIntensity\n=============================================");
        System.out.println(fl.getIntensityDescription());
        fl.decIntensity();
        System.out.println(fl.getIntensityDescription());
        
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
        fl.incIntensity();
        System.out.println(fl.getIntensityDescription());
    }
}