public class SuperHeroApp
{
    public static void main(String[] args)
    {
        AsteroidMan asteroidMan = new AsteroidMan();
        FriedEggMan friedEggMan = new FriedEggMan();
        MyHero theEventuallyAnomaly = new MyHero();
        
        theEventuallyAnomaly.setSuitColor("Platinum Sparkle");
        asteroidMan.setSuitColor("red and brown");
        friedEggMan.setSuitColor("purple......don't ask");
        
        theEventuallyAnomaly.setCape(true);
        asteroidMan.setCape(true);
        friedEggMan.setCape(false);
        
        
    }
}
