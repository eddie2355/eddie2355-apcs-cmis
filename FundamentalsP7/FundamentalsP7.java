public class FundamentalsP7
{
   public static void main( String [] args)
   {
        int[] randArray = new int[10];
        for(int index = 0;index < randArray.length; index++)
        {
            randArray[ index ] = (int) (Math.random() * (201) - 100 ) ;
        }  
//this block is using a for loop to assign 10 random values 
//between 100 and -100 inclusively to my randArray
int index = 0;
int negative = 0;
while(index < randArray.length)
{
    System.out.println( randArray[index] ) ;
     if(randArray[index] < 0)
            {
               negative = negative + 1; 
            }
    index++;
    
           
 } 
 //This block uses a while loop to print my randArray on different lines
 //and counts the number of negative numbers in my array, then in the line below
 //it tells me how many negative numbers there are.
    System.out.println("There are "+ negative + " negative numbers.");     
} 
}