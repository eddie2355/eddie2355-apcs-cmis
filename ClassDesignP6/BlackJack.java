public class BlackJack 
{
    private String card;
        
    public BlackJack(String card)
        {
            this.card = new String(card);
        }
    
    public String toString()
        {
           String output = String.format(card);
           return output;
        } 
}
