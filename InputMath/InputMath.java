import java.util.Scanner;

public class InputMath
{
   
    public static void main ( String[] args )
    {
        float numa, numb;
        System.out.println( "Please give me one number." );
        
        Scanner input = new Scanner( System.in );
        numa = input.nextFloat();
        
        System.out.println( "Please give me another number." );
        numb = input.nextFloat();
        
       
        System.out.println( numa + " + " + numb + " = " + (numa + numb));
        System.out.println( numb + " + " + numa + " = " + (numb + numa));
        System.out.println( numa + " - " + numb + " = " + (numa - numb));
        System.out.println( numb + " - " + numa + " = " + (numb - numa));
        System.out.println( numa + " x " + numb + " = " + (numa * numb));
        System.out.println( numb + " x " + numa + " = " + (numb * numa));
        System.out.println( numa + " / " + numb + " = " + (numa / numb));
        System.out.println( numb + " / " + numa + " = " + (numb / numa));
        System.out.println( numa + " % " + numb + " = " + (numa % numb));
        System.out.println( numb + " % " + numa + " = " + (numb % numa));
    }
    }
