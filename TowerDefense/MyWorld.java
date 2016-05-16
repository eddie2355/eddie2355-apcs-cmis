import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(690, 480, 1);
        setBackground(new GreenfootImage("8_paths_simple.png")); 
        setPaintOrder(Bullet.class, MyWorld.class);
    }
    
    private void addPlayer() 
    {
        Bullet bullet =  new MachineGunBullet();
        addActor(bullet ,100,100);
    }
    
     private void addActor(Actor block, int x, int y) {
        addObject(block, 100, 100);
    }
    
}
