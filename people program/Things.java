import java.util.ArrayList;
public class Things
{
    public static void main(String[] args){
        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        WalkieTalkie WT1 = new WalkieTalkie("WT1","red",.6,500.6,6);
        PlasmaTV Plasm = new PlasmaTV("Plasma 1","red","Hg69Alpha",420.78);
        LCDTV LCD1 = new LCDTV("lcd 1","red","Hg420Alpha",480.78);
        DLPTV dlper = new DLPTV("dlper","red","nova6supreme",20.78);
        LEDTV ledpipe = new LEDTV("LED pipe","red","nurp456oishin",375.78);
        devices.add(WT1);
        devices.add(Plasm);
        devices.add(LCD1);
        devices.add(dlper);
        devices.add(ledpipe);
        for(MyDevice device:devices){
            System.out.println(device);
        }
    }
}
