import javax.swing.JOptionPane;
public class weatherChaos
 {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog ( "Please enter an Integer between 1 & 31");
        int inputNum=Integer.parseInt(input);
        if(inputNum < 1 || inputNum > 31)
        {
            System.out.println("Sorry that is not a valid input.");
            return;
        }
        
        int [] randomNums = new int[inputNum];
        int [] allSwings = new int[inputNum];
        for(int i = 0; i < randomNums.length; i++)
        {
            randomNums[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println("day" + "\t" + "temp" + "\t" + "swing " + "\t" + "Description");
        
        String descript = "" ;
        for(int i = 0;i < 1;i++)
        {
            if (randomNums[0] < 0)
            {
                descript = "freezing";
            }
            else if(randomNums[0] >= 0 && randomNums[0] <= 15)
            {
                descript = "chilly";
            }
            else if(randomNums[0] >= 16 && randomNums[0] <= 30)
            {
                descript = "comfortable";
            }
            else if(randomNums[0] >= 31  && randomNums[0] <= 40)
            {
                descript = "hot";
            }
            else if(randomNums[0] >= 41)
            {
                descript = "AAAAAAUUUUUUGGHHHHHH!";
            }
            int swing = 0;
            int day = 1;
            System.out.println(day + "\t" + randomNums[0] + "\t" + swing + "\t" + descript );
            
        }
        
        for (int i =1; i < randomNums.length;i++)
        {
            
            if (randomNums[i] < 0)
            {
                descript = "freezing";
            }
            else if(randomNums[i] >= 0 && randomNums[i] <= 15)
            {
                descript = "chilly";
            }
            else if(randomNums[i] >= 16 && randomNums[i] <= 30)
            {
                descript = "comfortable";
            }
            else if(randomNums[i] >= 31  && randomNums[i] <= 40)
            {
                descript = "hot";
            }
            else if(randomNums[i] >= 41)
            {
                descript = "AAAAAAUUUUUUGGHHHHHH!";
            }
            int swing = randomNums[i] - randomNums[i - 1];
            System.out.println((i+1) + "\t" + randomNums[i] + "\t" + Math.abs(swing) +"\t" + descript );
            
        }
        
        int maximum = 0;
        for (int i = 0; i < randomNums.length; i++)
        {
               
               if(randomNums[i] > maximum)
               {
                   maximum = randomNums[i];
                   
                } 
        }
        int minimum = 200;
        for (int i = 0; i < randomNums.length; i++)
        {
               
               if(randomNums[i] < minimum)
               {
                   minimum = randomNums[i];
                   
                }
              
        } 
          int sum = 0;
        for (int i = 0; i < randomNums.length; i++)
        {
              sum = sum+randomNums[i];
              
        } 
        float average = (float) sum / (float) randomNums.length;
        
        System.out.println("Biggest temp: " + maximum);
        System.out.println("Lowest temp: " + minimum);
        System.out.println("Average temp: " + average);
        
        for (int i = 1; i < inputNum; i++)
        {
                allSwings[i] = randomNums[i] - randomNums[i - 1];
            if(allSwings[i] < 0)
                {
                    allSwings[i] = allSwings[i] * -1;
                }
                
        }
        
        int maxSwing = 0;
        int dayOf = 0;
        for (int i = 0; i < allSwings.length; i++)
        {
               
               if(allSwings[i] > maximum)
               {
                   maxSwing = allSwings[i];
                   dayOf = i+1;
                } 
        }
        
        System.out.println("Biggest swing was: " + maxSwing + " , and it happened on day: " + dayOf);
    }
}