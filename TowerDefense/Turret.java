import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Turret extends Tower
{
    private int enemyX;
    private int enemyY;
    private int speed;
    
    public void act() 
    {
        enemyX = super.getTarget().getX();     
        enemyY = super.getTarget().getY();
        
        setLocation(enemyX, enemyY);
        
        
    }    
}
