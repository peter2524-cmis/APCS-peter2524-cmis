public class ClockStore{
    private String name;
    private Clock[] clocksInStock = new Clock[3];
    public ClockStore(){
        this.name =" watch dogs clock emporium";
        this.clocksInStock[0] = new Clock(6,17,56);
        this.clocksInStock[1] = new Clock(7,18,57);
        this.clocksInStock[2] = new Clock(8,19,58);
    }
    
    public ClockStore(Clock[] clocks, String name){
        for(int x = 0;x<clocksInStock.length;x++){
            this.clocksInStock[x] = clocks[x];
        }
        this.name = name;
    }

    public int mostSeconds(){
        int index = 0;
        for(int x = 0;x<clocksInStock.length;x++){
            if(clocksInStock[x].totalSeconds()>clocksInStock[index].totalSeconds()){
                index = x;
            }
        }
        return index;
    }
    
    public String toString(){
        String out = "";
        out+="The name of the store is "+name+"\n";
        out+="the clocks in stock have the times of:\n";
        for(Clock clock:clocksInStock){
            out+=(clock);
            out+=("");
        }
        out+=" And the clock with the most seconds was Clock number "+ mostSeconds()+" With a whopping\n";
        out+= clocksInStock[mostSeconds()].totalSeconds()+" Seconds";
        return out;
    }
}
