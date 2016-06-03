import greenfoot.*;  

public interface Bullet extends Actor
{
    private int damage;
    private int fireRate;
    
    public abstract void Bullet();
    public abstract void SpecialEffect();
}
