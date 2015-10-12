public class BlackJackApp
{
    public static void main ( String[] args )
    {
       String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String [] suits = {"♠", "♣", "♦", "♥"};
       String[] Dealer = new String[2];
       String[] p1 = new String[2];
       String[] p2 = new String[2];
       String[] p3 = new String[2];
       String[] p4 = new String[2];
       String[] p5 = new String[2];
       String card = "";
       String rank = "";
       String suit = "";
       System.out.println("Your Hand");
       /*for(int i = 0;i<3;i++)
       {
           int randomNum1 = (int) (Math.random() * 13);
           int randomNum2 = (int) (Math.random() * 4);
           rank = ranks[randomNum1];
           suit = suits[randomNum2];
           card += (rank + suit); 
           if(card.equals("A♠")
           {
               card = "🂡";
            }
           else if(card.equals("2♠")
           {
               card = "🂢";
            }
            else if(card.equals("3♠")
           {
               card = "🂣";
            }else if(card.equals("4♠")
           {
               card = "🂤";
            }else if(card.equals("5♠")
           {
               card = "🂥";
            }else if(card.equals("6♠")
           {
               card = "🂦";
            }else if(card.equals("7♠")
           {
               card = "🂧";
            }else if(card.equals("8♠")
           {
               card = "🂨";
            }else if(card.equals("9♠")
           {
               card = "🂩";
            }else if(card.equals("10♠")
           {
               card = "🂪";
            }else if(card.equals("J♠")
           {
               card = "🂫";
            }else if(card.equals("Q♠")
           {
               card = "🂭";
            }else if(card.equals("K♠")
           {
               card = "🂮";
            }else if(card.equals("A♣")
           {
               card = "🂢";
            }else if(card.equals("2♣")
           {
               card = "🂢";
            }else if(card.equals("3♣")
           {
               card = "🂢";
            }else if(card.equals("4♣")
           {
               card = "🂢";
            }else if(card.equals("5♣")
           {
               card = "🂢";
            }else if(card.equals("6♣")
           {
               card = "🂢";
            }else if(card.equals("7♣")
           {
               card = "🂢";
            }else if(card.equals("8♣")
           {
               card = "🂢";
            }else if(card.equals("9♣")
           {
               card = "🂢";
            }else if(card.equals("10♣")
           {
               card = "🂢";
            }else if(card.equals("J♣")
           {
               card = "🂢";
            }else if(card.equals("Q♣")
           {
               card = "🂢";
            }else if(card.equals("K♣")
           {
               card = "🂢";
            }else if(card.equals("A♦")
           {
               card = "🂢";
            }else if(card.equals("2♦")
           {
               card = "🂢";
            }else if(card.equals("3♦")
           {
               card = "🂢";
            }else if(card.equals("4♦")
           {
               card = "🂢";
            }else if(card.equals("5♦")
           {
               card = "🂢";
            }else if(card.equals("6♦")
           {
               card = "🂢";
            }else if(card.equals("7♦")
           {
               card = "🂢";
            }else if(card.equals("8♦")
           {
               card = "🂢";
            }else if(card.equals("9♦")
           {
               card = "🂢";
            }else if(card.equals("10♦")
           {
               card = "🂢";
            }else if(card.equals("J♦")
           {
               card = "🂢";
            }else if(card.equals("Q♦")
           {
               card = "🂢";
            }else if(card.equals("K♦")
           {
               card = "🂢";
            }else if(card.equals("A♥")
           {
               card = "🂢";
            }else if(card.equals("2♥")
           {
               card = "🂢";
            }else if(card.equals("3♥")
           {
               card = "🂢";
            }else if(card.equals("4♥")
           {
               card = "🂢";
            }else if(card.equals("5♥")
           {
               card = "🂢";
            }else if(card.equals("6♥")
           {
               card = "🂢";
            }else if(card.equals("7♥")
           {
               card = "🂢";
            }else if(card.equals("8♥")
           {
               card = "🂢";
            }else if(card.equals("9♥")
           {
               card = "🂢";
            }else if(card.equals("10♥")
           {
               card = "🂢";
            }else if(card.equals("J♥")
           {
               card = "🂢";
            }else if(card.equals("Q♥")
           {
               card = "🂢";
            }
            else
            {
                card = "🂾"
            }
           System.out.println(card);
           BlackJack hand2 = new BlackJack(card);
           System.out.println( hand2 );
       }*/
    }
}
