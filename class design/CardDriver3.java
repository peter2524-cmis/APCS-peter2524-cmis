public class CardDriver3{
    public static void main(String[] args){
        int l = 0;
        Card[] hand1 = hand();
        Card[] dhand1 = draw(hand1);
        int h1val = adder(dhand1);
        System.out.println("player1 has ");
        while(l<dhand1.length){
            System.out.println(dhand1[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h1val);
        if(h1val>21){
            System.out.println("and has consequently busted");
        }
        System.out.println("\n");
        l = 0;
        Card[] hand2 = hand();
        Card[] dhand2 = draw(hand2);
        int h2val = adder(dhand2);
        System.out.println("player2 has ");
        while(l<dhand1.length){
            System.out.println(dhand1[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h2val);
        if(h2val>21){
            System.out.println("and has consequently busted");
        }
        System.out.println("\n");
        l = 0;
        Card[] hand3 = hand();
        Card[] dhand3 = draw(hand3);
        int h3val = adder(dhand3);
        System.out.println("player3 has ");
        while(l<dhand1.length){
            System.out.println(dhand1[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h3val);
        if(h3val>21){
            System.out.println("and has consequently busted");
        }
        System.out.println("\n");
        Card[] hand4 = hand();
        Card[] dhand4 = draw(hand4);
        int h4val = adder(dhand4);
        System.out.println("player4 has ");
        while(l<hand4.length){
            System.out.println(hand4[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h4val);
        if(h4val>21){
            System.out.println("and has consequently busted");
        }
        System.out.println("\n");
        Card[] hand5 = hand();
        Card[] dhand5 = draw(hand5);
        int h5val = adder(dhand5);
        System.out.println("player5 has ");
        while(l<hand5.length){
            System.out.println(hand5[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h5val);
        if(h5val>21){
            System.out.println("and has consequently busted");
        }
        System.out.println("\n");
        Card[] dealers = hand();
        Card[] dhanddeal = draw(dealers);
        int dealsval = adder(dhanddeal);
        System.out.println("The dealer has ");
        while(l<dealers.length){
            System.out.println(dealers[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+dealsval);
        if(dealsval>21){
            System.out.println("and has consequently busted");
        }

        String winner = winner(h1val,h2val,h3val,h4val,h5val,dealsval);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("And the winner is "+winner);
    }

    public static String winner(int h1val, int h2val, int h3val, int h4val, int h5val, int dealsval){
        int a = h1val ;
        if(a > 21){
            a = 0;
        }
        int b = h2val;
        if(b > 21){
            b = 0;
        }
        int c = h3val;
        if(c > 21){
            c = 0;
        }
        int d = h4val;
        if(d > 21){
            d = 0;
        }
        int e = h5val;
        if(e > 21){
            e = 0;
        }
        int f = dealsval;
        if(f > 21){
            f = 0;
        }
        if((a>=b)&&(a>= c) && (a>=d) && (a>=e) && (a>=f)){
            if(a>f||a==21){
                return "Player 1";
            }else{
                return "The Dealer";
            }
        }else if((b>= c) && (b>=d) && (b>=e) && (b>=f)){
            if(b>f||b==21){
                return "Player 2";
            }else{
                return "The Dealer";
            }
        }else if((c>=d) && (c>=e) && (c>=f)){
            if(c>f||c==21){
                return "Player 3";
            }else{
                return "The Dealer";
            }
        }else if((d>=e) && (d>=f)){
            if(d>f||d==21){
                return "Player 4";
            }else{
                return "The Dealer";
            }
        }else{
            if((e>f||e==21)){
                return "Player 5";
            }else{
                return "The Dealer";
            }
        }

    }

    public static int adder(Card[] hand){
        int value = 0;
        for(int x = 0;x<hand.length;x++){
            value += hand[x].getValue();
        }
        return value;
    }

    public static Card[] hand(){
        Card[] myHand = new Card[2];
        int l = 0;
        while( l < myHand.length){
            myHand[l] = new Card();
            l++;
        }
        int value1 = myHand[0].getValue(); 
        int value2 = myHand[1].getValue();
        int value = value1+value2;
        if(value == 22 && myHand.length == 2){
            value = 12;
        }
        return myHand;
    }    

    public static Card[] draw(Card[] hand){
        int value = 0;
        Card[] drawn = new Card[hand.length+1];
        for(int x = 0; x<hand.length;x++){
            value += hand[x].getValue();
        }
        if(value>=18){
            return hand;
        }else{
            drawn[hand.length] = new Card();
            for(int x = 0; x<hand.length;x++){
                drawn[x] = hand[x];
            }
            return draw(drawn);
        }
    }
}
