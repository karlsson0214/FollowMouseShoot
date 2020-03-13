import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author Rikard Karlsson
 * @version 20-03-06
 */
public class Gun extends Actor
{
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse;
        mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            // peka mot musen
            turnTowards(mouse.getX(), mouse.getY());
            // om knapp tryckt, så skjut
            if (mouse.getButton() > 0)
            {
                Bullet myBullet = new Bullet();
                getWorld().addObject(myBullet, getX(), getY());
                myBullet.setRotation(getRotation());
            }
        }
    }    
}
