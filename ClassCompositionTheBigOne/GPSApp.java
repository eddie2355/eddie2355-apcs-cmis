import java.util.ArrayList;
public class GPSApp
{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> markers = new ArrayList<Integer>();
        markers.add(90);//0
        markers.add(80);//1
        markers.add(90);//2
        markers.add(110);//3
        markers.add(120);//4
        markers.add(100);//5
        markers.add(80);//6
        markers.add(110);//7
        markers.add(150);//8
        markers.add(160);//9
        markers.add(160);//10
        markers.add(120);//11
        markers.add(100);//12
        
        GPS carGPS = new GPS ();
        GPS vanGPS = new GPS ( markers );
        
        System.out.println(vanGPS);
        if(vanGPS.isLevelTrailSegment(110, 160))
        {
            System.out.println("worked");
        }
        else
        {
            System.out.println("nah");
        }
    }
    
}
