import java.util.Random;
public class Card{
    Random rand = new Random();
    private int numselect = rand.nextInt(13) + 1;
    private String num;
    private String suit;    
    private int suitselect = (rand.nextInt(4) + 1);
    public Card(){
        if(numselect == 1){
            this.num = "Ace";
        }else if(numselect == 2){
            this.num = "2";
        }else if(numselect == 3){
            this.num = "3";
        }else if(numselect == 4){
            this.num = "4";
        }else if(numselect == 5){
            this.num = "5";
        }else if(numselect == 6){
            this.num = "6";
        }else if(numselect == 7){
            this.num = "7";
        }else if(numselect == 8){
            this.num = "8";
        }else if(numselect == 9){
            this.num = "9";
        }else if(numselect == 10){
            this.num = "10";
        }else if(numselect == 11){
            this.num = "Jack";
        }
        else if(numselect == 12){
            this.num = "Queen";
        }else if(numselect == 13){
            this.num = "King";
        }

        if(suitselect == 1){
            this.suit = "Hearts";
        }else if(suitselect == 2){
            this.suit = "Diamonds";
        }else if(suitselect == 3){
            this.suit = "Clubs";
        }else if(suitselect == 4){
            this.suit = "Spades";
        }
    }

    public String toString(){
        String out = "The "+num+" of "+suit; 
        return out;
    }

    public int getValue(){
        if(numselect == 1){
            return 11;
        }else if(numselect > 10){
            return 10;
        }else{
            return numselect;
        }
    }
}
