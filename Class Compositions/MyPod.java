public class MyPod
{
    private String colour;
    private double stgb;
    private Song[] songs = new Song[3];
    public MyPod(){
        this.colour = "red";
        this.stgb = 8.9;
    }

    public MyPod(String color, double stgb,Song[] songs){
        this.colour = color;
        this.stgb = stgb;
        for(int x = 0;x<this.songs.length;x++){
            this.songs[x] = songs[x];
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
