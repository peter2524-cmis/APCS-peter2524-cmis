import java.util.Random;
public class Card{
    Random rand = new Random();
    private char num= ((char)(rand.nextInt(13) + 1));
    private String suit;    
    private int  numselect = ((int)(num));
    private int suitselect = (rand.nextInt(4) + 1);
    public Card(char num, int suitselect){
        if(numselect>2&&numselect<10){
            this.num = num;
        }else if(numselect == 1){
            this.num = 'A';
        }else if(numselect == 11){
            this.num = 'J';
        }else if(numselect == 12){
            this.num = 'Q';
        }else if(numselect == 13){
            this.num = 'K';
        }
        if(suitselect == 1){
            suit = "Hearts";
        }else if(suitselect == 2){
            suit = "Diamonds";
        }else if(suitselect == 3){
            suit = "Clubs";
        }else if(suitselect == 4){
            suit = "SPades";
        }


    }
}
