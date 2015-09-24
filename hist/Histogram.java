import javax.swing.JOptionPane;

public class Histogram
 {
    public static void main(String[] args)
    {
        String nnum = JOptionPane.showInputDialog ( "Give me an integer~ PLLLLEEASSEEE");
        int num=Integer.parseInt(nnum);
        
        int [] randomNums = new int[num];
        int [] counts = new int [100];
       
        
        for (int index = 0; index < num; index++)
        {
           randomNums[ index ] = (int) (Math.random()*100);
        }    
        
        for (int index = 0; index < num; index++)
        {
               
                counts[randomNums[index]]++;
             
        }     
        for(int index = 0; index < counts.length;index++)
        {
            String hashtag = " ";
            for( int hashtags = 0; hashtags < counts[index] ; hashtags++)
            {
               hashtag += "#";
               
            }
            System.out.println(index + ": " + hashtag); 
            
        }
        int minimum = randomNums[0];
        for (int index = 0; index < randomNums.length; index++)
        {
               
               if(randomNums[index] < minimum)
               {
                   minimum = randomNums[index];
                   
                }
              
        }       
        System.out.println("Lowest Value: " + minimum);
        
        int maximum = randomNums[0];
        for (int index = 0; index < randomNums.length; index++)
        {
               
               if(randomNums[index] > maximum)
               {
                   maximum = randomNums[index];
                   
                }
              
        }       
        System.out.println("Biggest Value: " + maximum);
        
        int sum = 0;
        for (int index = 0; index < randomNums.length; index++)
        {
               
              sum = sum+randomNums[index];
              
        }       
        System.out.println("Sum Value: " + sum);
        
        
        float average = (float) sum / (float) randomNums.length;
        
        
        System.out.println( "Average: " + average);
        
         int most = counts[0];
         int greatest = 0;
        for (int index = 0; index < counts.length; index++)
        {
               
               if (counts[index] >= most )
               {
                   most = counts[index];
                   greatest = index;
                   
                }
              
        }       
        System.out.println("Most Ocurring Value: " + greatest);
         
   }
} 
