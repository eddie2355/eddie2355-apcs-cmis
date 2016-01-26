import java.util.ArrayList;
public class MyPod2App
{
    public static void main (String[] args)
    {
        ArrayList<String> songLibrary = new ArrayList<String>();
        
        songLibrary.add("Juan Bovi - Midnight Trailer");
        songLibrary.add("Juan Bovi - Living on a Peso");
        songLibrary.add("Juan Bovi - It's my Vida");
        
        MyPod2 carPod =  new MyPod2("Red" , "12 GB" , songLibrary);
        MyPod2 myPod = new MyPod2();
        
        System.out.println( myPod );
        
        System.out.println( "\n\n" );
        
        System.out.println( carPod );
    }//end app
}
