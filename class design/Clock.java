
public class Clock
{
    private int hours;
    private int mins;
    private int secs;
    private String indicator = "A.M.";
    public Clock(int hours, int mins, int secs){
        if(hours<0){
            this.hours = 0;
        }else if(hours>12){
            this.hours = hours-12;
            indicator = "P.M";
        }else{
            this.hours = hours;
        }
        if(mins<0){
            mins = 0;
        }else if(mins>60){
            this.mins = mins-60;
            this.hours = hours+1;        
        }else{
            this.mins = mins;
        }
        if(secs<0){
            secs = 0;
        }else if(secs>60){
            this.secs = secs-60;
            this.mins = mins+1;        
        }else{
            this.secs = secs;
        }
    }
    
    public Clock(){
        this.hours = 0;
        this.mins = 0;
        this.secs = 0;
    }
    
    public void setTime(int hours, int mins,int secs){
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    public void convertDaylightSaving( int hours ){
        this.hours = this.hours+hours;
    }
    
    public int totalSeconds(){
        return (this.hours*3600)+this.mins*60+this.secs;
    }

    public String toString(){
        String out = "The time is "+hours+":"+mins+":"+secs+" "+ indicator;
        return out;
    }
}
