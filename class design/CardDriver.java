public class CardDriver{    
    public static void main(String[] args){
        Card[] myHand = new Card[3];
        int l = 0;
        while( l < myHand.length){
            myHand[l] = new Card();
            l++;
        }
        l = 0;
        while( l < myHand.length){
            System.out.println(myHand[l]);
            l++;
        }
    }
}
