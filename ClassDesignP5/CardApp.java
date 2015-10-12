public class CardApp
{
    public static void main ( String[] args )
    {
       String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String [] suits = {"♠", "♣", "♦", "♥"};
       String rank = "";
       String suit = "";
       System.out.println("Your Hand");
       String card1 = "";
       String card2 = "";
       String card3 = "";
       for(int i = 0;i<3;i++)
       {
           int randomNum1 = (int) (Math.random() * 13);
           int randomNum2 = (int) (Math.random() * 4);
           rank = ranks[randomNum1];
           suit = suits[randomNum2];
           
           Card hand2 = new Card(rank, suit, card1,card2,card3);
           System.out.println( hand2 );
       }
       
       Card hand1 = new Card();
       System.out.println("Your Hand");
       System.out.println( hand1 );
    }
}

