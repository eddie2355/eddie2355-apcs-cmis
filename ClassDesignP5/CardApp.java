public class CardApp
{
    public static void main ( String[] args )
    {
       int[] handRank = new int[3];
       int[] handSuit = new String[3];
       
       for(i = 0;i < handRank;i++)
       {
           handRank[i] = (int) Math.random() * 12;
           handSuit[i] = (int) Math.random() * 5;
           if(handRank[i] < 11 && handSuit == 1)
           {
               rank = handRank[i];
               suit = ♠;
               Card hand2 = new Card(rank, suit);
            }
            if(handRank[i] < 11 && handSuit == 2)
           {
               rank = handRank[i];
               suit = ♣;
               Card hand2 = new Card(rank, suit);
            }
            if(handRank[i] < 11 && handSuit == 3)
           {
               rank = handRank[i];
               suit = ♦;
               Card hand2 = new Card(rank, suit);
            }
            if(handRank[i] < 11 && handSuit == 4)
           {
               rank = handRank[i];
               suit = ♥;
               Card hand2 = new Card(rank, suit);
            }
           
           System.out.println( hand2 );
       }
       
       Card hand1 = new Card();
       System.out.println( hand1 );
    }
}

