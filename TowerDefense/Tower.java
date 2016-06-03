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
            int indexMin = 0;
            List <Enemy> enemies = getObjectsInRange(15, Enemy.class);
            for(int i = 0; i < enemies.size();i++)
            {
                
              
                Enemy target = enemies.get(0);
            }
        }
        return this.target;
    }
    
    
}
