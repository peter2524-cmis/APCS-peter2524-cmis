public class Song{
    private double length;
    private int tempo;
    private String name = "";

    public Song(String name, int tempo, double length){
        if(name == ""){
            this.name = "Untitled";
        }else{
            this.name = name;
        }
        if(tempo>0){
            this.tempo = tempo;
        }else{
            this.tempo = 100;
        }
        if(length>0.0){
            this.length = length;
        }else{
            this.length = 3.30;
        }
    }
    
    public Song(){
        this.name = "Untitled";
        this.length = 0.0;
        this.tempo = 0;
    }
    
    public String toString(){
        String out = "";
        out+= "Song name: " + name + "\n";
        out+= "Song duration(mins.secs): " + length + "\n";
        out+= "Tempo: " + tempo +"\n";
        return out;
    }
}