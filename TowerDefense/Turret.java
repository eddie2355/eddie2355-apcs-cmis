import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Turret extends Tower
{
    private int enemyX;
    private int enemyY;
    
    public void act() 
    {
        enemyX = super.getTarget().getX();     
        enemyY = super.getTarget().getY();
        
        while(getTarget() != null)
        {
            Bullet b - new MachineGunBullet();
            getWorld().addObject( b, 30,30); // test bullet spawn and movement
            setLocation(enemyX, enemyY);
        }
        
        
    }    
}
