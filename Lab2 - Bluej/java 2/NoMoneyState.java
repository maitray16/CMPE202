public class NoMoneyState implements IGumballMachine 
{
    GumballMachine gumballMachine;
    int amount;
    public NoMoneyState(GumballMachine gumballMachine) 
    {
      this.gumballMachine = gumballMachine;
    }
   
    public void insertQuarter() 
    {
        gumballMachine.setCost(25);
        amount = gumballMachine.getCost();
        System.out.println("You inserted a quarer : " + "25 cents");
        if (gumballMachine.getCost() >= 50)
        {
          System.out.println("Total amount inserted is "+ amount +" cents.");   
          gumballMachine.setState(gumballMachine.getHasMoneyState());
        }
        else
        {
            System.out.println("Insert " + (50 - amount) + " more to get a gumball");
        }
    }
    
    public void insertNickel()
    {
        gumballMachine.setCost(5);
        amount = gumballMachine.getCost();
        System.out.println("You inserted a nickel : " + "5 cents");
        
        if (gumballMachine.getCost() >= 50)
        {
          System.out.println("Total amount inserted is "+ amount +" cents.");   
          gumballMachine.setState(gumballMachine.getHasMoneyState());
        }
        else
        {
            System.out.println("Insert " + (50 - amount) + " more to get a gumball");
        }
    }
    
    public void insertDime()
    {
        gumballMachine.setCost(10);
         amount = gumballMachine.getCost();
        System.out.println("You inserted a dime : " + "10 cents");
        if (gumballMachine.getCost() >= 50)
        {
           System.out.println("Total amount inserted is "+ amount +" cents.");     
          gumballMachine.setState(gumballMachine.getHasMoneyState());
        }
        else
        {
            System.out.println("Insert " + (50 - amount) + " more to get a gumball");
        }
    }
 
 
    public void ejectQuarter() 
    {
        System.out.println("You haven't inserted a quarter");
    }

    public void ejectNickel() 
    {
        System.out.println("You haven't inserted a Nickel");
    }
    
    public void ejectDime()
    {
        System.out.println("You haven't inserted a Dime");
    }
    
    public void turnCrank()
    {
        if (gumballMachine.getCost() == 0)
        {
            System.out.println("You turned, but there's no money inserted");
        }
        else
        {
            System.out.println("You turned, but you inserted only "+ gumballMachine.getCost() + " Cents. Insert "+ (50-gumballMachine.getCost())+" more to get the gumball");
        }
    }
 
    public void dispense()
    {}
 
    public void takeGumballFromSlot() 
    {
        System.out.println("You need to insert a minimum of 50 cents to get the gumball");
        if (gumballMachine.getCost() > 0)
        {
            System.out.println("Amount Returned : " + gumballMachine.getCost());
            gumballMachine.setCost(-gumballMachine.getCost());
        }
    } 

    public boolean isGumballInSlot()
    { 
        return gumballMachine.getGumballStatus();
    }
 
    public String toString()
    {
        return "waiting for quarter";
    }
}
