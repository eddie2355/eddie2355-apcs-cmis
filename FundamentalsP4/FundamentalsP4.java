import java.util.Random;
public class FundamentalsP4

{

    public static void main ( String args [] )
    {
     
   
     for (int i = 1; i < 11; i = i + 1) { 
     Random random = new Random();
     int max = (i*i +1);
     int min = i;
     int randomInt = random.nextInt(max - min)+ min;
     System.out.println( i + "\t" + (i*i) + "\t" + randomInt); }
   
    }
}