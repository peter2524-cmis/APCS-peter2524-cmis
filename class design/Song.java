public class Song{
    private int length;
    private int tempo;
    private String name = "";
    private int yearReleased;

    public Song(String name, int tempo, int length, int yearReleased){
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
        if(length>0){
            this.length = length;
        }else{
            this.length = 330;
        }if(yearReleased<=0){
            this.yearReleased = 1998;
        }else{
            this.yearReleased = yearReleased;
        }
    }

    public Song(){
        this.name = "Untitled";
        this.length = 000;
        this.tempo = 0;
        this.yearReleased = 1998;
    }

    public int getYearReleased(){
        return this.yearReleased;
    }

    public void setYearReleased(int newYear){
        this.yearReleased = newYear;
    }

    public String convertToMinSec(){
        String out = "";
        int secs = this.length%60;
        int mins = (length-secs)/60;
        out = mins+"mins and "+secs+" seconds.";
        return out;
    }

    public String toString(){
        String out = "";
        out+= "Song name: " + name + "\n";
        out+= "Song duration: "+ convertToMinSec() + "\n";
        out+= "Tempo: " + tempo +"\n";
        out+= "Year Released: "+ yearReleased + "\n";
        return out;
    }
}