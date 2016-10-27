import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class RandomPicker extends Picker
{
    Message message = new Message();
    Gumball gumball;
    
    public RandomPicker()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 115 ) ; 
    }
   
    public void setMessage(String msg)
    {
        World world = getWorld();
        if (message.getWorld() != null)
        {
            world.removeObject(message);
        }
        world.addObject(message, 200, 100);
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
        int whichball = Greenfoot.getRandomNumber(3);
        switch( whichball )
        {
            case 0: gumball = new BlueGumball();
                    break;
            case 1: gumball = new RedGumball(); 
                    break;
            case 2: gumball = new GreenGumball(); 
                    break;
        }
        World world = getWorld();
        world.addObject(gumball, 655, 150);
        
    }    
}
