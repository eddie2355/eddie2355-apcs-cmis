import greenfoot.*; 
import java.util.List;
public class MachineGunBullet extends Bullet
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
        Enemy target;
        if(target == null)
        {
            List <Enemy> enemies = getObjectsInRange(15, Enemy.class);
            
            for (int i; i < enemies.size();i++)
            {
                int index = 0;
                //int index;
                if(Math.sqrt(Math.pow(getX()-enemies.get(i).getX(),2)+Math.pow(getY()-enemies.get(i).getY(),2)) < Math.pow(getX()-enemies.get(i + 1).getX(),2)+Math.pow(getY()-enemies.get(i + 1).getY(),2))
                {
                    index = i;
                }
                else if(i == enemies.size() - 1 && Math.sqrt(Math.pow(getX()-enemies.get(i + 1).getX(),2)+Math.pow(getY()-enemies.get(i + 1).getY(),2)) < Math.pow(getX()-enemies.get(i).getX(),2)+Math.pow(getY()-enemies.get(i).getY(),2))
                {
                    index = i + 1;
                }
                
               
            }
        }
        Bullet b = new Bullet();
        getWorld().addObject(b, getX(), getY()); //Adds bullet at the Players X and Y.
        b.turnTowards(mouse.getX(), mouse.getY()); //Turns the bullet towards the mouse.
        b.move(getImage().getWidth() / 2); //Moves the bullet to the edge of the player.
        b.setRotation(getRotation() - 90); //Turns the rotation of the bullet to offset it.
        b.move(21); //Moves the bullet over to the gun.
        
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
