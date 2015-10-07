public class Card
{
    private String rank;
    private byte suit;
    public Card()
        {
            rank = "";
            suit = 0;
        }
    
    public Card(String rank, byte suit)
        {
            this.rank = new String(rank);
            this.suit = suit;
        }
    
    public String toString()
        {
            String output = String.format("");
            return output;
        }
        
    
}
