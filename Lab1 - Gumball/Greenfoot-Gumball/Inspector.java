import greenfoot.*;  
import java.util.ArrayList;

public class Inspector extends Alien
{
   private ArrayList<Picker> list_of_pickers = new ArrayList<Picker>(); 
   Message message = new Message();
   
    public Inspector()
    {
        GreenfootImage image = getImage() ;
        image.scale( 110, 150 ) ; 
    }
    
    public void inspect(Coin coin)
    {
        GumballWorld gumball = (GumballWorld) getWorld();
        if(coin.getClass()==Quarter.class)
        {
            int picker_number = Greenfoot.getRandomNumber(list_of_pickers.size()); 
            Picker chosen = list_of_pickers.get(picker_number);
            gumball.display_label(" Here is your Gumball ");
            chosen.select();
        }
        
        if (coin.getClass()==Penny.class)
        {
            gumball.display_label(" Which gumball machine accepts \n a bitcoin. THINK ");
        }
        
        if (coin.getClass()==FakeQuarter.class)
        {
            gumball.display_label(" Inserting a fake quarter.\n You dont mess with me ");
        }
    }
    
     public void addPicker(Picker obj)
    {
        list_of_pickers.add(obj);
    }
    
    public void removePicker(Picker obj)
    {
        list_of_pickers.remove(obj);
    }
   
    public void setMessage(String msg)
    {
        World world = getWorld();
        if (message.getWorld() != null)
        {
            world.removeObject(message);
        }
        world.addObject(message, 533, 350);
        message.setText(msg);
    }
    
    public Message getMessageObj()
    {
        return this.message;
    }
    
    
  
 
 

}
