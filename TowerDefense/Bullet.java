import greenfoot.*;  

public abstract class Bullet extends Actor
{
    private int  damage;
    private int  fireRate;
    private Enemy target;
    
    public abstract void Bullet();
    
    public abstract void SpecialEffect();
}
