public class Card
{
    private String rank;
    private String suit;
    /*public Card()
        {
            rank = "";
            suit = "";
        }
    */
    public Card(String rank, String suit)
        {
            this.rank = new String(rank);
            this.suit = new String( suit );
        }
    
    public String toString()
        {
           String output = String.format(rank+suit + "\t");
           return output;
        } 
}
