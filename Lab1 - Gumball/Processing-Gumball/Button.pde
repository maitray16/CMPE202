class Button {
  String label;
  float x;    
  float y;    
  float w;    
  float h;
  int ma;
  
  public Button(String labelButton, float xposition, float yposition,
  float widthButton, float heightButton , int mouseAction) 
  {
    label = labelButton;
    x = xposition;
    y = yposition;
    w = widthButton;
    h = heightButton;
    ma = mouseAction;
  }
  
   void Draw() {
   if(ma == 1)
   {
     //GRAY BACKGROUND - mouse over
     fill(211);
     stroke(0);
     rect(x, y, w, h, 10);
     textAlign(CENTER, CENTER);
     fill(0);
     text(label, x + (w / 2), y + (h / 2));
   }
   else if(ma == 0)
   {
     //WHITE BACKGROUND - no mouse over
     fill(255);
     stroke(0);
     rect(x, y, w, h, 10);
     textAlign(CENTER, CENTER);
     fill(0);
     text(label, x + (w / 2), y + (h / 2));
   }
   else if(ma==2)
   {
     fill(0);
     stroke(0);
     rect(x, y, w, h, 10);
     textAlign(CENTER, CENTER);
     fill(255);
     text(label, x + (w / 2), y + (h / 2));
   }
   
  }
  
  
  
  boolean MouseIsOver()
  {
    if (mouseX > x && mouseX < (x + w) && mouseY > y && mouseY < (y + h)) {
      return true;
    }
    return false;
  }
  
  void mouseReleased()
  {
    
  }
}