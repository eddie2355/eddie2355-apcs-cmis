import greenfoot.*; 

public class MachineGunBullet extends Bullet_SuperClass
{
    private int  damage;
    private int  fireRate;
    private Enemy target;
    private int enemyHealth; //standin for future enemy health variable
    
    public void act() 
    {
        
        
        /*if(target.getEnemyType().equals("light"))
        {
            
        }
        
        else
        {
            
        }*/
    }    
    
    public void shoot()
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
     
    /*
    Bullet b = new Bullet();
    getWorld().addObject(b, getX(), getY()); //Adds bullet at the Players X and Y.
    b.turnTowards(mouse.getX(), mouse.getY()); //Turns the bullet towards the mouse.
    b.move(getImage().getWidth() / 2); //Moves the bullet to the edge of the player.
    b.setRotation(getRotation() - 90); //Turns the rotation of the bullet to offset it.
    b.move(21); //Moves the bullet over to the gun.
    b.turnTowards(mouse.getX(), mouse.getY()); //Turns the bullet towards the mouse, again.
            shootdelay = 0; //Resets the shootdelay back to 0.
        
}
    
    public void Bullet()
    {
        this.damage = 2;
        this.fireRate = 10;
    }
    
    public void SpecialEffect()
    {
           this.damage += 1; 
    }
}
