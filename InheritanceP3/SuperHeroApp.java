import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main(String[] args)
    {
        AsteroidMan asteroidMan = new AsteroidMan();
        FriedEggMan friedEggMan = new FriedEggMan();
        MyHero theEventuallyAnomaly = new MyHero();

        SuperHero[][] capedHeroes = new SuperHero[3][3];
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

        for(int i = 0; i < heroes.size();i++)
        {
            for(int row = 0; row < capedHeroes.length;row++)
            {
                for(int col = 0; col < capedHeroes[0].length;col++)
                {
                    if(heroes.get(i).isCaped() && i < 1)
                    {
                        capedHeroes[row][col] = heroes.get(i);
                        SuperHero removal =  heroes.get(i);
                        heroes.remove(removal);
                    }
                    else if(heroes.get(i).isCaped() && i >= 1 )
                    {
                        capedHeroes[row][col + i] = heroes.get(i);
                        SuperHero removal =  heroes.get(i);
                        heroes.remove(removal);
                        i--;
                    }
                }
            }
        }

        System.out.println("*printing 2d array of caped heroes* \n");
        for(int row = 0; row < capedHeroes.length;row++)
        {
            for(int col = 0; col < capedHeroes[1].length; col++)
            {
                 if(capedHeroes[row][col] != null)
                 {
                    System.out.println(capedHeroes[row][col].getName() + "  -/-  " + capedHeroes[row][col].getSuitColor() + "  -/-  " + capedHeroes[row][col].isCaped() + "  -/-  " + capedHeroes[row][col].motto() + "   " );
                 }
                 else if(capedHeroes[row][col] == null)
                 {
                    System.out.print(capedHeroes[row][col] + "    ");
                 }
            }
            System.out.println("\n");
        }

        System.out.println("*printing heroes left after edit*\n");
        for(SuperHero hero : heroes)
        {
            System.out.println(hero.getName() + "  -/-  " + hero.getSuitColor() + "  -/-  " + hero.isCaped() + "  -/-  " + hero.motto() + "\n" );
        }//printing heroes
        }
    }
