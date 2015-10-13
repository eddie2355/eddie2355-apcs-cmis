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
       String user = "";
       int points = 0;
       int[] pointsArray = new int[6];
       for (int index = 0;index<6;index++)
           {
           user = "Player"+index;
           points = 0;
               if(index == 0)
           {
               user ="Dealer";
            }
           System.out.println(user);
           for(int i = 0;i<2;i++)
           {
               int randomNum1 = (int) (Math.random() * 13);
               int randomNum2 = (int) (Math.random() * 4);
               rank = ranks[randomNum1];
               suit = suits[randomNum2];
               card = "";
               card += (rank + suit); 
               if(card.equals("A♠"))
               {
                   card = "🂡";
                   if(points >=11)
                   {
                       points = points + 1;
                    }
                    else
                    {
                        points = points + 11;
                    }
                }
               else if(card.equals("2♠"))
               {
                   card = "🂢";
                   points = points + 2;
                }
                else if(card.equals("3♠"))
               {
                   card = "🂣";
                   points = points + 3;
                }
                else if(card.equals("4♠"))
               {
                   card = "🂤";
                   points = points + 4;
                }
                else if(card.equals("5♠"))
               {
                   card = "🂥";
                   points = points + 5;
                }
                else if(card.equals("6♠"))
               {
                   card = "🂦";
                   points = points + 6;
                }else if(card.equals("7♠"))
               {
                   card = "🂧";
                   points = points + 7;
                }
                else if(card.equals("8♠"))
               {
                   card = "🂨";
                   points = points + 8;
                }
                else if(card.equals("9♠"))
               {
                   card = "🂩";
                   points = points + 9;
                }
                else if(card.equals("10♠"))
               {
                   card = "🂪";
                   points = points + 10;
                }
                else if(card.equals("J♠"))
               {
                   card = "🂫";
                   points = points + 10;
                }
                else if(card.equals("Q♠"))
               {
                   card = "🂭";
                   points = points + 10;
                }
                else if(card.equals("K♠"))
               {
                   card = "🂮";
                   points = points + 10;
                }
                else if(card.equals("A♣"))
               {
                   card = "🃑";
                   if(points >=11)
                   {
                       points = points + 1;
                    }
                    else
                    {
                        points = points + 11;
                    }
                }
                else if(card.equals("2♣"))
               {
                   card = "🃒";
                   points = points + 2;
                }
                else if(card.equals("3♣"))
               {
                   card = "🃓";
                   points = points + 3;
                }
                else if(card.equals("4♣"))
               {
                   card = "🃔";
                   points = points + 4;
                }
                else if(card.equals("5♣"))
               {
                   card = "🃕";
                   points = points + 5;
                }
                else if(card.equals("6♣"))
               {
                   card = "🃖";
                   points = points + 6;
                }
                else if(card.equals("7♣"))
               {
                   card = "🃗";
                   points = points + 7;
                }
                else if(card.equals("8♣"))
               {
                   card = "🃘";
                   points = points + 8;
                }
                else if(card.equals("9♣"))
               {
                   card = "🃙";
                   points = points + 9;
                }
                else if(card.equals("10♣"))
               {
                   card = "🃚";
                   points = points + 10;
                }
                else if(card.equals("J♣"))
               {
                   card = "🃛";
                   points = points + 10;
                }
                else if(card.equals("Q♣"))
               {
                   card = "🃝";
                   points = points + 10;
                }
                else if(card.equals("K♣"))
               {
                   card = "🃞";
                   points = points + 10;
                }
                else if(card.equals("A♦"))
               {
                   card = "🃁";
                   if(points >=11)
                   {
                       points = points + 1;
                    }
                    else
                    {
                        points = points + 11;
                    }
                }
                else if(card.equals("2♦"))
               {
                   card = "🃂";
                   points = points + 2;
                }
                else if(card.equals("3♦"))
               {
                   card = "🃃";
                   points = points + 3;
                }
                else if(card.equals("4♦"))
               {
                   card = "🃄";
                   points = points + 4;
                }
                else if(card.equals("5♦"))
               {
                   card = "🃅";
                   points = points + 5;
                }
                else if(card.equals("6♦"))
               {
                   card = "🃆";
                   points = points + 6;
                }
                else if(card.equals("7♦"))
               {
                   card = "🃇";
                   points = points + 7;
                }
                else if(card.equals("8♦"))
               {
                   card = "🃈";
                   points = points + 8;
                }
                else if(card.equals("9♦"))
               {
                   card = "🃉";
                   points = points + 9;
                }
                else if(card.equals("10♦"))
               {
                   card = "🃊";
                   points = points + 10;
                }
                else if(card.equals("J♦"))
               {
                   card = "🃋";
                   points = points + 10;
                }
                else if(card.equals("Q♦"))
               {
                   card = "🃍";
                   points = points + 10;
                }
                else if(card.equals("K♦"))
               {
                   card = "🃎";
                   points = points + 10;
                }
                else if(card.equals("A♥"))
               {
                   card = "🂱";
                   if(points >=11)
                   {
                       points = points + 1;
                    }
                    else
                    {
                        points = points + 11;
                    }
                }
                else if(card.equals("2♥"))
               {
                   card = "🂲";
                   points = points + 2;
                }
                else if(card.equals("3♥"))
               {
                   card = "🂳";
                   points = points + 3;
                }
                else if(card.equals("4♥"))
               {
                   card = "🂴";
                   points = points + 4;
                }
                else if(card.equals("5♥"))
               {
                   card = "🂵";
                   points = points + 5;
                }
                else if(card.equals("6♥"))
               {
                   card = "🂶";
                }
                else if(card.equals("7♥"))
               {
                   card = "🂷";
                   points = points + 7;
                }
                else if(card.equals("8♥"))
               {
                   card = "🂸";
                   points = points + 8;
                }
                else if(card.equals("9♥"))
               {
                   card = "🂹";
                   points = points + 9;
                }
                else if(card.equals("10♥"))
               {
                   card = "🂺";
                   points = points + 10;
                }
                else if(card.equals("J♥"))
               {
                   card = "🂻";
                   points = points + 10;
                }
                else if(card.equals("Q♥"))
               {
                   card = "🂽";
                   points = points + 10;
                }
                else if(card.equals("K♥"))
                {
                    card = "🂾";
                    points = points + 10;
                }
               pointsArray[index] = points;
               BlackJack hand2 = new BlackJack(card);
               System.out.println( hand2 );
           }
           System.out.println("Points: " + points + "\n");
        }
       if(pointsArray[1] <= pointsArray[0])
       {
           System.out.println("Sorry Player 1 but you lost");
        }
       else if(pointsArray[1] > pointsArray[0])
       {
           System.out.println("Player 1 wins!");
        }
        else if(pointsArray[1] <= pointsArray[0] && pointsArray.equals(21))
       {
           System.out.println("Player 1 wins!");
        }
       if(pointsArray[2] <= pointsArray[0])
       {
           System.out.println("Sorry Player 2 but you lost");
        }
       else if(pointsArray[2] > pointsArray[0])
       {
           System.out.println("Player 2 wins!");
        }
        else if(pointsArray[2] <= pointsArray[0] && pointsArray.equals(21))
       {
           System.out.println("Player 2 wins!");
        }
       if(pointsArray[3] <= pointsArray[0])
       {
           System.out.println("Sorry Player 3 but you lost");
        }
       else if(pointsArray[3] > pointsArray[0])
       {
           System.out.println("Player 3 wins!");
        }
        else if(pointsArray[3] <= pointsArray[0] && pointsArray.equals(21))
       {
           System.out.println("Player 3 wins!");
        }
        if(pointsArray[4] <= pointsArray[0])
       {
           System.out.println("Sorry Player 4 but you lost");
        }
       else if(pointsArray[4] > pointsArray[0])
       {
           System.out.println("Player 4 wins!");
        }
        else if(pointsArray[4] <= pointsArray[0] && pointsArray.equals(21))
       {
           System.out.println("Player 4 wins!");
        }
        if(pointsArray[5] <= pointsArray[0])
       {
           System.out.println("Sorry Player 5 but you lost");
        }
       else if(pointsArray[5] > pointsArray[0])
       {
           System.out.println("Player 5 wins!");
        }
        else if(pointsArray[5] == pointsArray[0] && pointsArray.equals(21))
       {
           System.out.println("Player 5 wins!");
        }
    }
}
