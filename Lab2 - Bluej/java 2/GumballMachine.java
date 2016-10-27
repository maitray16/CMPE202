public class GumballMachine 
{
 
    IGumballMachine soldOutState;
    IGumballMachine noEnoughState;
    IGumballMachine hasEnoughState;
    IGumballMachine soldState;
 
    IGumballMachine state = soldOutState;
    int count = 0;
    int amount = 0;
    int gumball_number = 0;
    boolean isGumballinSlot=false;
 
    public GumballMachine(int numberGumballs) 
    {
        soldOutState = new SoldOutState(this);
        noEnoughState = new NoMoneyState(this);
        hasEnoughState = new HasMoneyState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) 
        {
            state = noEnoughState;
        }
        else
        {
            state = soldOutState;
        }
    }
 
    public void insertQuarter() 
    {
        state.insertQuarter();
    }
 
    public void ejectQuarter() 
    {
        state.ejectQuarter();
    }
    
    public void insertDime()
    {
        state.insertDime();
    }
    
    public void insertNickel()
    {
        state.insertNickel();
    }
 
    public void turnCrank() 
    {
        state.turnCrank();
        state.dispense();
    }

    void setState(IGumballMachine state)
    {
        this.state = state;
    }
    
    void setCost(int amt)
    {
        amount += amt;
    }
    
    public void takeGumballFromSlot() 
    {
       state.takeGumballFromSlot(); 
    }
 
    void releaseBall() 
    {
        System.out.println("A gumball comes rolling out the slot...");
        setCost(-50);
        if (count != 0) 
        {
            count = count - 1;
        }
    }
 
    int getCount()
    {
        return count;
    }
 
    void refill(int count) 
    {
        System.out.print(count+" gumballs added to GumballMachine ");
        this.count = count;
        state = noEnoughState;
    }

    public IGumballMachine getState() 
    {
        return state;
    }

    public IGumballMachine getSoldOutState()
    {
        return soldOutState;
    }

    public IGumballMachine getNoMoneyState()
    {
        return noEnoughState;
    }

    public IGumballMachine getHasMoneyState() 
    {
        return hasEnoughState;
    }

    public IGumballMachine getSoldState() 
    {
        return soldState;
    }
    
    public boolean isGumballInSlot()
    {
      return state.isGumballInSlot(); 
    }
    
    public boolean getGumballStatus()
    {
        return this.isGumballinSlot;
    }
    
    public void setGumballStatus(boolean flag) 
    {
      this.isGumballinSlot=flag;
    }
    
 
    public String toString() 
    {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Amount inserted "+ amount);
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    public int getGumballNumber()
    {
       return gumball_number;     
    }
       
    public void setGumballNumber(int number)
    {
        gumball_number = number;
    }
    
    int getCost() 
    {
        return amount;  
    }
}
