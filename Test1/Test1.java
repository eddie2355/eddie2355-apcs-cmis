import java.util.Scanner;
public class Test1
{
     public static void main ( String[] args )
    {
        System.out.println("Please enter a number.");
        Scanner input = new Scanner( System.in );
        int x = input.nextInt();
        
        double[] randArray = new double[x];
        for(int index = 0; index < randArray.length;index++)
        {
             randArray[ index ] = (double) (Math.random() * (51));
             System.out.println(index + ":" + randArray[index]);
             
             
        }
    
        int indexer = 0;
        int index = 0;
         while(index < randArray.length)
                 {
                     double rem = randArray[indexer] % 2;
                     while(rem >= 1 && indexer < randArray[index] - 1)
                     {
                         System.out.print("O");
                         
                         indexer++;
                     }
                      while(rem < 1  && indexer < randArray[index] - 1)
                     {
                         System.out.print("E");
           
                         indexer++;
                     }
                     System.out.print(randArray[index]);
                     
                     index++;
                 }
         
        
       
    }
}
