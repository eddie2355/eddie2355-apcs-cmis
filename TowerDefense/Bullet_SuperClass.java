import greenfoot.*;  

public abstract class Bullet_SuperClass extends Actor
{
    private String name;
    private int  damage;
    private int  fireRate;
    private String effect;
    private Enemy_SuperClass target;
    
    public abstract void Shoot();
    
    public abstract void Bullet();
    
    public abstract void SpecialEffect();
}
