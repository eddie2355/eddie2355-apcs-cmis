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
        
        //GreenfootImage cell = new GreenfootImage(26, 26);//13 fits perfectly, need # to fit map
        //cell.setColor(java.awt.Color.white);
        //cell.fill();
        //cell.setColor(java.awt.Color.gray);
        //cell.drawRect(0, 0, 49, 49);
        //setBackground(cell);
        
    }
    
    private void addPlayer() 
    {
        Bullet bullet =  new MachineGunBullet();
        addActor(bullet ,50,50);
    }
    
     private void addActor(Actor block, int x, int y) {
        addObject(block, 100, 100);
    }
    
}
