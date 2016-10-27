import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Message extends Actor
{
    GreenfootImage gi;
    
    public Message()
        {
           gi=new GreenfootImage(200,40);
           setImage(gi);
        }
       
    public void setText(String msg)
    {
            gi.clear();
            gi.setColor(java.awt.Color.GRAY);
            gi.fill();
            gi.setColor(java.awt.Color.WHITE);
            gi.drawString(msg,5,18);
    }
    
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
           World world =getWorld();
           world.removeObject(this);
        }
    }    
}
