public class Card
{
    private String rank;
    private String suit;
    private String card1;
    private String card2;
    private String card3;
    public Card()
        {
            card1 = "K♦ \n";
            card2 = "10♥ \n";
            card3 = "A♥ ";
            rank = "";
            suit = "";
        }
        
    public Card(String rank, String suit, String card1, String card2, String card3)
        {
            this.rank = new String(rank);
            this.suit = new String( suit );
            this.card1 = new String(card1);
            this.card2 = new String( card2 );
            this.card3 = new String( card3 );
            
        }
    
    public String toString()
        {
           String output = String.format(rank+suit +
                                         card1 + card2 + card3);
           return output;
        } 
}
