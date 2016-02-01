import java.util.ArrayList;
public class GPS
{
    private ArrayList<Integer> markers = new ArrayList<Integer>();
    
    public GPS()
    {
        markers.add(100);//0
        markers.add(150);//1
        markers.add(105);//2
        markers.add(120);//3
        markers.add(90);//4
        markers.add(80);//5
        markers.add(50);//6
        markers.add(75);//7
        markers.add(75);//8
        markers.add(70);//9
        markers.add(80);//10
        markers.add(90);//11
        markers.add(100);//12
    }
    
    public GPS( ArrayList<Integer> markers )
    {
        this.markers = markers;
    }
    
    public void addMarker(int marker)
    {
        markers.add(marker);
    }
    
    public int getLength()
    {
        return markers.size();
    }
    
    public boolean isLevelTrailSegment(int begin, int end)
    {
        boolean isLevel = true;
        int startIndex = 0;
        int endIndex = 0;
        
        if(begin != end)
        {
           isLevel = false; 
        }
        else
        {
            for(int i = 0; i < markers.size(); i++)
            {
                if( markers.get(i) == begin)
                {
                    startIndex = i;
                }
            }
            
            for(int i = 0; i < markers.size(); i++)
            {
                if( markers.get(i) == end)
                {
                    endIndex = i;
                }
            }
            
            for(int i = startIndex; i < endIndex + 1; i ++)
            {
                if(markers.get(i) - markers.get(i + 1) >= 10)
                {
                    isLevel = false;
                }
            }
        }
        return isLevel;
    }
    
    public String toString()
    {
        String output = new String("Index Elevation \n");
        int counter = 0;
        for ( int s : markers)
        {
            output += counter + " " + s + "\n" ;
            counter ++;
        }
        return output;
    }
}
