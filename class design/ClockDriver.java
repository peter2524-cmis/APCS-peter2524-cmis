public class ClockDriver{
    public static void main(String[] args){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        Clock BedroomClock = new Clock(15,30,12);
        System.out.println(BedroomClock);
    }
}
