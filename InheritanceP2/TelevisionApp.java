import java.util.ArrayList;
public class TelevisionApp
{
    public static void main(String[] args)
    {
        Television tv = new Television("Generic", 1.99);
        Television plasma = new Television("Plasma", 100.99);
        Television dlp = new Television("DLP", 45.99);
        Television lcd = new Television("LCD", 33.99);
        Television led = new Television("LED", 66.99);
        
        ArrayList<Television> stock = new ArrayList();
        stock.add(tv);
        stock.add(plasma);
        stock.add(dlp);
        stock.add(lcd);
        stock.add(led);
        
        for(Television tele : stock)
        {
            System.out.println( tele);
        }
   }
}
