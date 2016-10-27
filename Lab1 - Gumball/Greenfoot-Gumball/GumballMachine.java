import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GumballMachine extends Actor
{
    Message message = new Message();
    Actor coin_stored;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 480, 360 ) ; 
    }
   
    public void setMessage(String msg)
    {
        World world = getWorld();
        if (message.getWorld() != null)
        {
            world.removeObject(message);
        }
        world.addObject(message, 400, 550);
        message.setText(msg);
    }
    
    public void act() 
    {
        GumballWorld gumball = (GumballWorld) getWorld();
        Inspector inspector = gumball.getInspector();
        GreenPicker greenpicker = gumball.getGreenPicker();
        RandomPicker randompicker = gumball.getRandomPicker();
        
        if(Greenfoot.mousePressed(this))
        {
            
            if(coin_stored == null)
                setMessage(" No free gumballs ");
            else
            {
                setMessage(" Crank Turned ");
                gumball.display_label("Wait for inspector");
                inspector.inspect((Coin)coin_stored);
            }
        }
       
        Actor coin_inserted = getOneObjectAtOffset( +7, +7, Coin.class) ;
        if(coin_inserted != null)
        {
           coin_stored = coin_inserted;
           Greenfoot.playSound("Coin.wav");
           gumball.display_label(" Turn Crank ");
           ((Coin)coin_inserted).inSlot();
            
        }
    }
}
