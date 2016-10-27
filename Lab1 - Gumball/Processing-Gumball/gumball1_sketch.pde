Button button1, button2;
int clk = 1;
GumballMachine gumballMachine = new GumballMachine(5);
void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 24);
  button1 = new Button("Insert Coin",65,300,150,60,0);
  button2 = new Button("Crank It",65,450,150,60,0);
}

void draw()
{
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.png");
  image(image, (width-image.width)/2, (height-image.height)/2);  
   if (button1.MouseIsOver()) 
  {
     button1 = new Button("Insert Coin",65,300,150,60,1);
  }
  else 
  {
     button1 = new Button("Insert Coin",65,300,150,60,0);
  }
  
  if(button2.MouseIsOver())
  {
     button2 = new Button("Crank It",65,450,150,60,1);
  }
  else
  {
     button2 = new Button("Crank It",65,450,150,60,0);
  }
   button1.Draw();
   button2.Draw();
  
}

void mousePressed()
{
  if (button1.MouseIsOver())
  {
    
    button1 = new Button("Insert Coin",65,300,150,60,2);
    gumballMachine.insertQuarter();
    System.out.println(gumballMachine);
    button1.Draw();
  }
  
  if(button2.MouseIsOver())
  {
    
    button2 = new Button("Crank It",65,450,150,60,2);
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
    button2.Draw();
  }
}


public void runTest() {
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
}