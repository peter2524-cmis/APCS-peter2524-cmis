
public class Dragon{
    private int psi = 0;
    private double length = 0;
    public Dragon(){
        this.psi = psi;
        this.length = length;
    }
    public Dragon(int psi, double length){
        this.psi = psi;
        if(length<0.0){
            this.length = 8.8;            
        }else{
            this.length = length;
        }
    }
    public String toString(){
        String out = "";
        out+="The dragon has "+psi+" psi and is "+length+" feet long";
        return out;
    }
}
