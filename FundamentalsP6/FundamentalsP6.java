public class FundamentalsP6
{
   public static void main( String [] args)
   {
int[] randArray = new int[100];
for(int index = 0; index < randArray.length; index++)
{
   randArray[ index ] = (int) (Math.random() * 101 ) ; 
}
for(int index = 0; index < randArray.length; index++)
{
   System.out.print( randArray[ index] + " " ) ; 
}
//this code uses one for loop to creat an array of 100 random integers between -100 and 100
//and then uses another ofr loop to print out the array.
    }
    
    
    
      
    
}