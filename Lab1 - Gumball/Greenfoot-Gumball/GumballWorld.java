import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GumballWorld extends World
{

    private Inspector inspector;
    private GumballMachine gumballmachine;
    private RandomPicker randompicker;
    private GreenPicker greenpicker;
    
    public GumballWorld()
    {
        super(800, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        gumballmachine = new GumballMachine();
        addObject(gumballmachine, 375, 250);
        addObject( new Penny(), 100, 100 ) ;
        addObject( new Quarter(), 100, 200 ) ;
        addObject( new FakeQuarter(), 100, 300 ) ;
        inspector = new Inspector();
        addObject(inspector, 460, 340);
        randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        inspector.addPicker(randompicker);
        inspector.addPicker(greenpicker);
        this.display_label(" HEY THERE , INSERT 50 CENTS \n TO GET A GUMBALL ");
    }
     
   
    public void display_label(String msg)
    {
        Message m = new Message();
        addObject(m, 150,550);
        m.setText(msg);
    }
    
    //Getter methods-
    public Inspector getInspector()
    {
        return this.inspector;
    }
    
    public GumballMachine getGumballMachine()
    {
        return this.gumballmachine;
    }
    
    public RandomPicker getRandomPicker()
    {
        return this.randompicker;
    }
    
    public GreenPicker getGreenPicker()
    {
        return this.greenpicker;
    }
    
}
