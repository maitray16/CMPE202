import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GumballMachineTestCase
{
    
    @Test
    public void test1()
    {
        // Testing if inserted money isnt enough then no gumball is given and money is returned back.
        GumballMachine gumballMachineTest1 = new GumballMachine(10);
        gumballMachineTest1.insertNickel();
        gumballMachineTest1.insertDime();
        gumballMachineTest1.insertQuarter();
        gumballMachineTest1.turnCrank();
        assertEquals(false, gumballMachineTest1.isGumballInSlot());
        gumballMachineTest1.takeGumballFromSlot(); 
         
    }
    
    @Test
    public void test2()
    {
        // Testing if enough money inserted is enough then release gumball and 
        // on turning crank again it shouldnt.
        GumballMachine gumballMachineTest2 = new GumballMachine(10);
         gumballMachineTest2.insertNickel();
        gumballMachineTest2.insertDime();
        gumballMachineTest2.insertQuarter();
        gumballMachineTest2.insertQuarter();
        gumballMachineTest2.turnCrank();
        assertEquals(true, gumballMachineTest2.isGumballInSlot());
        gumballMachineTest2.turnCrank();
        gumballMachineTest2.takeGumballFromSlot();
        assertEquals(false, gumballMachineTest2.isGumballInSlot());
    }
    
    @Test
    public void test3()
    {
        // Testing if the isGumballInSlot() is false after taking gumball from slot.
        GumballMachine gumballMachineTest3 = new GumballMachine(10);
        gumballMachineTest3.insertQuarter();
        gumballMachineTest3.insertQuarter();
        gumballMachineTest3.insertNickel();
        gumballMachineTest3.turnCrank();      
        assertEquals(true, gumballMachineTest3.isGumballInSlot());
        gumballMachineTest3.takeGumballFromSlot(); 
        assertEquals(false, gumballMachineTest3.isGumballInSlot());
    }
    
    @Test
    public void test4()
    {
       // Inserting money and getting a gumball , again repeating and checking if the 
       // isGumballInSlot() is true  and after takingGumballFromSlot() does isGumballInSlot() changes to false
       GumballMachine gumballMachineTest4 = new GumballMachine(10);
       gumballMachineTest4.insertQuarter();
       gumballMachineTest4.insertDime();
       gumballMachineTest4.insertDime();
       gumballMachineTest4.insertNickel();
       gumballMachineTest4.turnCrank();
       assertEquals(true, gumballMachineTest4.isGumballInSlot());
       gumballMachineTest4.insertQuarter();
       gumballMachineTest4.insertQuarter();
       gumballMachineTest4.turnCrank();
       assertEquals(true, gumballMachineTest4.isGumballInSlot());
       gumballMachineTest4.takeGumballFromSlot();
       assertEquals(false, gumballMachineTest4.isGumballInSlot());
      
    }
    
    @Test
    public void test5()
   {
      GumballMachine gumballMachineTest5 = new GumballMachine(2);
      gumballMachineTest5.insertQuarter();
      gumballMachineTest5.insertQuarter();
      gumballMachineTest5.turnCrank();
      assertEquals(true, gumballMachineTest5.isGumballInSlot());
      gumballMachineTest5.insertDime();
      gumballMachineTest5.insertQuarter();
      gumballMachineTest5.insertNickel();
      gumballMachineTest5.insertQuarter();
      gumballMachineTest5.turnCrank();
      assertEquals(true, gumballMachineTest5.isGumballInSlot());
      gumballMachineTest5.takeGumballFromSlot();
      assertEquals(false, gumballMachineTest5.isGumballInSlot());
      gumballMachineTest5.insertQuarter();
      gumballMachineTest5.insertNickel(); 
      gumballMachineTest5.turnCrank();
      assertEquals(false, gumballMachineTest5.isGumballInSlot());
      gumballMachineTest5.takeGumballFromSlot();
    }

   
}











