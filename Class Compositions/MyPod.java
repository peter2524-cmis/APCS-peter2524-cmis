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
        
    }
}
