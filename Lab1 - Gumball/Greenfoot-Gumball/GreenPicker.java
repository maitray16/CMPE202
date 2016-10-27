import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GreenPicker extends Picker
{
    Message message = new Message();
    Gumball gumball = new GreenGumball();
    
     public GreenPicker()
    {
        GreenfootImage image = getImage() ;
        image.scale( 110, 122 ) ; 
    }
    
    public void setMessage(String msg)
    {
        World world = getWorld();
        if (message.getWorld() != null)
        {
            world.removeObject(message);
        }
        world.addObject(message, 686, 504);
        message.setText(msg);
    }
    
    public Message getMessageObj()
    {
        return this.message;
    }
    
    public Gumball getGumBallObj()
    {
        return this.gumball;
    }
    
    public void select()
    {
    	World world = getWorld();
    	world.addObject(gumball, 620, 455);
    	
    }
}
