public class SoldOutState implements IGumballMachine 
{
    GumballMachine gumballMachine;
    int change;
    
    public SoldOutState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertQuarter() 
    {
        gumballMachine.setCost(25);
        System.out.println("You inserted a quarter");
        
    }
 
    public void insertNickel() 
    {
        gumballMachine.setCost(5);
        System.out.println("You inserted a nickel");
    }
    
    
    public void insertDime() 
    {
            gumballMachine.setCost(10);
            System.out.println("You inserted a Dime");
    }
    
    public void ejectQuarter() 
    {
        System.out.println("You already turned the crank");
    }
    
    public void ejectNickel()
    {
        System.out.println("You already turned the crank");
    }
    public void ejectDime()
    {
        System.out.println("You already turned the crank");
    } 
 
    public void turnCrank()
    {
        
            if (gumballMachine.getCost() > 0)
            {
               System.out.println("Collected" + " gumball/s from slot");
               System.out.println("Ooops the machine is out of gumballs");
               System.out.println("The nice gumball machine is returning your change "+ gumballMachine.getCost() + " Cents");
                
            }
            
            gumballMachine.setGumballStatus(false);
            gumballMachine.setGumballNumber(0);
            gumballMachine.setState(gumballMachine.getSoldOutState());
     
    }
  
    public void dispense() 
    {
       if (gumballMachine.getCount() > 0 && 
            gumballMachine.getCost() >= 50 && 
            gumballMachine.getGumballStatus() == false)
       {
           gumballMachine.releaseBall(); 
           gumballMachine.setGumballStatus(true);
       }
       
       else if(gumballMachine.getCount() > 0 && 
                gumballMachine.getCost() < 50 && 
                gumballMachine.getGumballStatus() == false) 
       {
           System.out.println("You turned crank but inserted only "+ gumballMachine.getCost() +
                                " cents, Insert "+ (50 - gumballMachine.getCost()) + 
                                " cents more to get the absolutely delicious gumball");
       }
       
       if (gumballMachine.getCount() <= 0)
       {
           gumballMachine.setState(gumballMachine.getSoldOutState());
           gumballMachine.setGumballStatus(false);
    
       } 
    }
    
    
    public void takeGumballFromSlot() 
    {
                     
     
            if (gumballMachine.getCost() > 0)
            {
               System.out.println("Collected" + " gumball/s from slot");
               System.out.println("Ooops the machine is out of gumballs");
               System.out.println("The nice gumball machine is returning your change "+ gumballMachine.getCost() + " Cents");
                
            }
            
            gumballMachine.setGumballStatus(false);
            gumballMachine.setGumballNumber(0);
            gumballMachine.setState(gumballMachine.getSoldOutState());
     
   }
    
   public boolean isGumballInSlot()
   {
        return gumballMachine.getGumballStatus();
   }
 
   public String toString()
   {
        return "dispensing a gumball";
   }
}


