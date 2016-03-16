import java.util.ArrayList;
public class MyDeviceApp
{
    public static void main (String[] args)
    {     
        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        MyRadar radar = new MyRadar();
        MyRadar radar2 = new MyRadar(8, "purple", 576);
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(2, "silver", false);
        
        devices.add(radar);
        devices.add(radar2);
        devices.add(phone1);
        devices.add(phone2);
        
        for(MyDevice device : devices)
        {
            System.out.println(device + "\n");
        }
        
    }
}
