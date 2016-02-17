import java.util.ArrayList;
public class MyDeviceApp
{
    public static void main (String[] args)
    {     
        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        MyRadar radar = new MyRadar();
        MyRadar radar2 = new MyRadar(8, "purple", 576);
        
        devices.add(radar);
        devices.add(radar2);
        
        for(MyDevice device : devices)
        {
            System.out.println(device + "\n");
        }
        
    }
}
