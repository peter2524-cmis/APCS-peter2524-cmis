import java.util.ArrayList;
public class MyPod2
{
    private String colour;
    private double stgb;
    private ArrayList<Song> songs = new ArrayList<>();
    public MyPod2(){
        this.colour = "red";
        this.stgb = 8.9;
    }

    public MyPod2(String color, double stgb,Song[] songs){
        this.colour = color;
        this.stgb = stgb;
        for(int x = 0;x<this.songs.size();x++){
            this.songs.set(x,songs[x]);
        }
    }

    public String toString(){
        String out = "";
        out +="the colour is "+this.colour+"\n";
        out +="It has a Storage capacity of "+this.stgb+" in gigabites \n";
        out +="and on it are the songs";
        for(Song song:songs){
            out+=(song);
            out+="";
        }
        return out;
    }
}
