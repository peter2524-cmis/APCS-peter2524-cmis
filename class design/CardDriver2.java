public class CardDriver2{
    public static void main(String[] args){
        int l = 0;
        Card[] hand1 = hand();
        int h1val = adder(hand1);
        System.out.println("player1 has ");
        while(l<hand1.length){
            System.out.println(hand1[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h1val); 
        Card[] hand2 = hand();
        int h2val = adder(hand2);
        System.out.println("player2 has ");
        while(l<hand2.length){
            System.out.println(hand2[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h2val); 
        Card[] hand3 = hand();
        int h3val = adder(hand3);
        System.out.println("player3 has ");
        while(l<hand3.length){
            System.out.println(hand3[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h3val); 
        Card[] hand4 = hand();
        int h4val = adder(hand4);
        System.out.println("player4 has ");
        while(l<hand4.length){
            System.out.println(hand4[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h4val); 
        Card[] hand5 = hand();
        int h5val = adder(hand5);
        System.out.println("player5 has ");
        while(l<hand5.length){
            System.out.println(hand5[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+h5val); 
        Card[] dealers = hand();
        int dealsval = adder(dealers);
        System.out.println("The dealer has ");
        while(l<dealers.length){
            System.out.println(dealers[l]);
            l++;
        }
        l = 0;
        System.out.println(" wich has a value of "+dealsval);

        String winner = winner(h1val,h2val,h3val,h4val,h5val,dealsval);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("And the winner is "+winner);
    }

    public static String winner(int h1val, int h2val, int h3val, int h4val, int h5val, int dealsval){
        int a = h1val ;
        int b = h2val;
        int c = h3val;
        int d = h4val;
        int e = h5val;
        int f = dealsval;
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
            if(e>f||e==21){
                return "Player 5";
            }else{
                return "The Dealer";
            }
        }

    }

    public static int adder(Card[] hand){
        int value1 = hand[0].getValue(); 
        int value2 = hand[1].getValue();
        int value = value1+value2;
        if(value == 22){
            value = 12;
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
        return myHand;
    }    
}
