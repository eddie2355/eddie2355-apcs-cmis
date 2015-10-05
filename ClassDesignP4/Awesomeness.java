public class Awesomeness
{
    private int aLevel;
    private String name;
    private String disclaimer;
    public Awesomeness()
        {
            aLevel = 9001 ;
            name = "Eddie Awesome";
            disclaimer = "*Any similarities to persons living or dead is completely coincidental. \n" +
                           "All calculations are extremely accurate. \n";
        }
    
    public Awesomeness(int aLEvel, String name, String disclaimer)
        {
            this.aLevel = aLevel;
            this.name = new String( name );
            this.disclaimer = new String( disclaimer );
        }
    
    public String toString()
        {
            String output = String.format(disclaimer + "\n" + 
                                          "Name: " + name + "\n" + 
                                          "Calculated Awesomeness Level: " + aLevel);
            return output;
        }
        
    
}
