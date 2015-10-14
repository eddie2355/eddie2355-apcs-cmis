public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private double x;
    private double y;
    private double z;
    private String name;
    public Cubiverse()
        {
            name = "Default Cubiverse-" + Math.random();
            w = 1;
            h = 1;
            d = 1;
            x = 0.50;
            y = 0.50;
            z = 0.50;
        }
        
    public Cubiverse(int w, int h, int d, String name)
        {
            this.w = w;
            this.h = h;
            this.d = d;
            this.name = new String( name );
            x = 0.5;
            y = 0.5;
            z = 0.5;
        }
        
    public Cubiverse(double x, double y, double z, String name)
        {
            this.x = x;
            this.y = y;
            this.z = z;
            this.name = new String( name );
            w = 1;
            h = 1;
            d = 1;
        }
        
    public String toString()
        {
            String output = new String();
            output = ("Name: " + name + "\n" +
                      "w: " + w + "\n" +
                      "h: " + h + "\n" +
                      "d: " + d + "\n" +
                      "volume: " + (w * h * d) + "\n" +
                      "x: " + x + "\n" +
                      "y: " + y + "\n" +
                      "z: " + z + "\n" +
                      "distance from left: "+ ((double)w * x) + "\n" +
                      "distance from bottom: "+ ((double)h * y) + "\n" +
                      "distance from back: "+ ((double)d * z) + "\n\n");
            return output;
        }
        
    
}
