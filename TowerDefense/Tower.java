import greenfoot.*;  
import java.util.List;

public abstract class Tower extends Actor
{
     private int fireRate;
     private Enemy target;
     
     public abstract void Tower();
    public abstract void act();
      
    public Enemy getNearestTarget()
     public Enemy getTarget()
      {
         this.target = getNearestTarget();
         this.target = getTarget();
          if(target != null)
          {
              return this.target;
          }
          else 
          {
              List <Enemy> enemies = getObjectsInRange(15, Enemy.class);
             
             for (int i = 0; i < enemies.size();i++)
            {
               int index = 0;
                 if(i != (enemies.size() - 1) && Math.sqrt(Math.pow(getX()-enemies.get(i).getX(),2)+Math.pow(getY()-enemies.get(i).getY(),2)) < Math.pow(getX()-enemies.get(i + 1).getX(),2)+Math.pow(getY()-enemies.get(i + 1).getY(),2))
                 {
                     index = i;
                 }
                 else if(i == (enemies.size() - 1) && Math.sqrt(Math.pow(getX()-enemies.get(i + 1).getX(),2)+Math.pow(getY()-enemies.get(i + 1).getY(),2)) < Math.pow(getX()-enemies.get(index).getX(),2)+Math.pow(getY()-enemies.get(index).getY(),2))
                 {
                     index = i + 1;
                 }
                 this.target = enemies.get(index);
                 
             }
             Enemy target = enemies.get(0);
          }
          return this.target;
      }
     
     
  }
