import greenfoot.*; 
import java.util.List;

public class MachineGunBullet extends Bullet
{
    private int  damage;
    private int  fireRate;
    private Enemy target;
    private int eHealth; //standin for future enemy health variable
    
    public void act() 
    {
        /*
         * 
        this.fireRate = 5
        this.target = getNearestTarget();
        this.eHealth = this.target.getEnemyHealth
         
        if(target.getEnemyType().equals("light"))
        {
            this.damage = this.damage + 1;
            
        }
        
        else
        {
            this.damage = this.damage;
        }
        
        */
        

    }    
    
    
    public boolean atWorldEnd()
    {
        if (getX() <= 15)
          {
              setRotation(getRotation() + 80);
          }
        if (getY() <= 15)
          {
              setRotation(getRotation() + 80);
          }
        if (getX() >= getWorld().getWidth() - 15)
          {
              setRotation(getRotation() + 80);
          }
        if (getY() >= getWorld().getHeight() - 15)
          {
              setRotation(getRotation() + 80);
          }
          return true;
    }
    
    
    
    /*public void shoot()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
       
        Bullet b = new MachineGunBullet();
        getWorld().addObject(b, getX(), getY()); //Adds bullet at the Players X and Y.
        b.turnTowards(getNearestTarget().getX(), getNearestTarget().getY()); //Turns the bullet towards the target.
        b.move(getImage().getWidth() / 2); //Moves the bullet to the edge of the player.
        //b.setRotation(getRotation() - 90); //Turns the rotation of the bullet to offset it.
        //b.move(21); //Moves the bullet over to the gun.
        
    }*/
    
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
