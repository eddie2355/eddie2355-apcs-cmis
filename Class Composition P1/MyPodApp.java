public class MyPodApp
{
    public static void main (String[] args)
    {
        String[] songLibrary = { "Juan Bovi - Midnight Trailer", "Juan Bovi - Living on a Peso" , "Juan Bovi - It's my Vida"};
        MyPod carPod =  new MyPod("Red" , "12 GB" , songLibrary);
        MyPod myPod = new MyPod();
        
        System.out.println( myPod );
        
        System.out.println( "\n\n" );
        
        System.out.println( carPod );
    }//end app
}
