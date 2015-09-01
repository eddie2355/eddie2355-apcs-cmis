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
    // This block of code uses a for loop and the variable i to make a list of 1 - 10 
    //and then show the variable i value, the square of i, and a random integer between
    //variable i and its square. then prints it all out on spereate lines for each i value
    //up to 10.
}