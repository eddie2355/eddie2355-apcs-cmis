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
            System.out.println(hero.getName() + "  -/-  " + hero.getSuitColor() + "  -/-  " + hero.isCaped() + "  -/-  " + hero.motto() + "\n" );
        }//printing heroes
        
        for(int i = 0; i<heroes.size();i++)
        {
            SuperHero removal = heroes.get(i);
            for(int row = 0; row < capedHeroes.length;row++)
            {
                if(heroes.get(i).isCaped() == true )
                {
                    for(int col = 0; col < capedHeroes[1].length; col++)
                    {
                        capedHeroes[row][col] = heroes.get(i).getName();
                        removal = heroes.get(i);
                        heroes.remove(removal);
                    }
                }
            }//assigning cape heroes to 3x3 array
        }
        
        System.out.println("printing heroes left after edit");
       for(SuperHero hero : heroes)
        {
            System.out.println(hero.getName() + "  -/-  " + hero.getSuitColor() + "  -/-  " + hero.isCaped() + "  -/-  " + hero.motto() + "\n" );
        }//printing heroes
        
        //System.out.println(" 
  }
}
