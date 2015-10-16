public class Planet
{
    private int maxPopulation;
    private double percentSpaceMarines;
    private double maxSpaceMarinesPerStarDestroyer;
    private String statusReal;
    private int spaceMarines;
    private int starDestroyer;
    private double iD;
    private double radius;
    private int statuser;
    private int namer;
    private String[] names;
    private String[] status;
    public Planet()
    {
        String names[] = { "Beta", "Alpha", "Gamma", "Delta"};
        String status[] = {"hostile", "neutral", "at war", "ally", "friendly"};
        String name = "";
        radius = 1.0;
        maxPopulation = 1;
        percentSpaceMarines = 1.0;
        spaceMarines = 1;
        starDestroyer = 1;
        maxSpaceMarinesPerStarDestroyer =  spaceMarines / starDestroyer;
        iD = Math.random() * 1;
        //idea was to use an array to store possible names and possible relationships with arrays name and status.
        //it comes up as null. this same wethod was going to be applied to the multiple argument method.
    }
     //public Planet()
     //{
         //maxSpaceMarinePerDestroyer = spaceMarines / starDestroyers;
         //radius = Math.random() * 1;
         //spaceMarines = maxPopulation * percentSpaceMarines;
       // }
    public String toString()
    {
        String output = String.format("Name: " + names[(int) Math.random()*3] + "%.2f \n" +
                                      "Relationship: " + status[ (int) (Math.random()*4)] + "\n" +
                                      "Radius: %.2f \n" +
                                      "Population: " + maxPopulation + "\n" +
                                      "Space Marines as percent of Pop.: %.2f \n" +
                                      "Space Marines: " + spaceMarines + "\n" +
                                      "Star Destroyers: " + starDestroyer + "\n" +
                                      "Space Marines per star destroyer: %.2f \n", iD, radius, percentSpaceMarines, maxSpaceMarinesPerStarDestroyer);
        return output;
    }
}
