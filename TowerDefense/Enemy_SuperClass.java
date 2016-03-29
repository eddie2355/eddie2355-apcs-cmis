import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy_SuperClass extends Actor
{
    private int health;
    private int speed;
    private int value;
    public abstract void act(); 
    
    public abstract int dropCoins();
}
