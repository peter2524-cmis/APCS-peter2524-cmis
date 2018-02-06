import java.util.Random;
public class Planet{
    Random rand = new Random();
    private String name;
    private double rad;
    private int moonnum;
    private boolean ringstat;
    double namer = 0.0 + (1.0 - 0.0) * rand.nextDouble();
    public Planet(){
        name = "Planet "+ namer;
        rad = 5.0 + (100.0 - 5.0) * rand.nextDouble();
        moonnum = rand.nextInt(11);
        int ringsider = rand.nextInt(100)+1;
        if(ringsider <75){
            ringstat = false;
        }else{
            ringstat = true;
        }
    }

    public Planet(String name, double rad, int moonnum, boolean ringstat){
        if(name == "Alderaan"){
            this.name = "The shattered remains of Alderaan";
        }else{
            this.name = name;
        }
        if((rad<5.0)||(rad>100.0)){
            this.rad = 5.0;
        }else{
            this.rad = rad;
        }
        if((moonnum<0)||(moonnum>10)){
            this.moonnum = 0;
        }else{
            this.moonnum = moonnum;
        }

    }

    public static void main(String[] args){
        Planet p1 = new Planet();
        System.out.println(p1);
        System.out.println();

        Planet p2 = new Planet();
        System.out.println(p2);
        System.out.println();

        Planet p3 = new Planet("Tatooine", -100.0, 35, true);
        System.out.println(p3);
        System.out.println();

        Planet p4 = new Planet("Alderaan", 35.234234, 2, false);
        System.out.println(p4);
        System.out.println();

        Planet p5 = new Planet("Endor", 12.234234, 2, true);
        System.out.println(p5);
        System.out.println();

        Planet p6 = new Planet("Dagoba", 85.4, 0, true);
        System.out.println(p6);
        System.out.println();

    }

    public String toString(){
        String out = "";
        out+="Name:" +name+"\n";
        out+="Radius:" +rad+"\n";
        out+="Number of moons:" +moonnum+"\n";
        if(moonnum<=0){
            if(ringstat = true){
                out+="and this planet has rings";
            }else{
                out+="and this planet dosn't have rings";
            }
        }else{
            out+="and this planet dosn't have rings";
        }
        return out;       
    }
}