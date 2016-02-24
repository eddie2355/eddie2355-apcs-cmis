import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main(String[] args)
    {
        AsteroidMan asteroidMan = new AsteroidMan();
        FriedEggMan friedEggMan = new FriedEggMan();
        MyHero theEventuallyAnomaly = new MyHero();
        
        String[][] capedHeroes = new String[3][3];
        ArrayList<SuperHero> heroes = new ArrayList();
        
        theEventuallyAnomaly.setSuitColor("Platinum Sparkle");
        asteroidMan.setSuitColor("red and brown");
        friedEggMan.setSuitColor("purple......don't ask");
        
        theEventuallyAnomaly.setCape(true);
        asteroidMan.setCape(true);
        friedEggMan.setCape(false);
        
        theEventuallyAnomaly.setName("The Eventually Anomaly");
        asteroidMan.setName("Asteroid Man");
        friedEggMan.setName("Fried Egg Man");
        
        heroes.add(asteroidMan);
        heroes.add(friedEggMan);
        heroes.add(theEventuallyAnomaly);
        
        for(SuperHero hero : heroes)
        {
            System.out.println(hero.getName() + "  -/-  " + hero.getSuitColor() + "  -/-  " + hero.isCaped() + "  -/-  " + hero.motto() );
        }//printing heroes
        
        for(int row = 0; row < capedHeroes.length;row++)
        {
            for(int col = 0; col < capedHeroes[1].length; col++)
            {
                
            }
        }//assigning cape heroes to 3x3 array
    
    }
}
