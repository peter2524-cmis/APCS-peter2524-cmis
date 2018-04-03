public class Business extends Organization implements Payable
{
    private double money;
    public Business(String name){
        super(name);
    }
    
    public void operate(){
        System.out.println(getOrgName() + " does it's business.");
    }
    
    public void pay(double fee){
        money +=  fee;
        System.out.println(money + " money in our coffers!");
    }
}
