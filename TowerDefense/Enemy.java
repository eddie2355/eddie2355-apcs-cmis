import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    private int health;
    private int speed;
    private int value;
    public abstract void act(); 
    
    public abstract int dropCoins();
}
