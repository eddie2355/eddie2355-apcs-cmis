import greenfoot.*;  
import java.util.List;

public abstract class Tower extends Actor
{
    private int damage;
    private int fireRate;
    private Enemy target;
    
    public abstract void act();
    
    public Enemy getTarget()
    {
        this.target = getTarget();
        if(target != null)
        {
            return this.target;
        }
        else 
        {
            List <Enemy> enemies = getObjectsInRange(15, Enemy.class);
            Enemy target = enemies.get(0);
        }
        return this.target;
    }
    
    
}
