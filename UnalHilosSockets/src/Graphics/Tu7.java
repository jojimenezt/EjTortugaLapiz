package Graphics;

import ch.aplu.turtle.*;
import java.awt.Color;

//circulo.hideTurtle()	The Turtle becomes invisible. This enables it to move and draw faster
public class Tu7 extends TurtleFrame
{
public Tu7()
{
 Turtle tri = new Turtle(this, Color.blue);
 Turtle rectangulo = new Turtle(this, Color.red);
 Turtle cir = new Turtle(this, Color.green);
 tri.setPos(-100, -100);
 rectangulo.setPos(-20, -100);
 cir.setPos(60, -100);
 rectangulo.setPenColor(Color.red);
 cir.setPenColor(Color.green);
 draw(tri);
 draw(rectangulo);
 draw(cir);
}
  
private void square(Turtle t, int l){
    for (int i = 0; i < 4; i++)
        t.forward(l).right(90);
        t.forward(l);
}

private void rect(Turtle t, int b, int h){
    for (int i = 0; i < 2; i++)
        t.forward(h).right(90);
        t.forward(b);
}

private void circulo(Turtle t,int r)
{
 for (int i = 50; i < 180; i++)
    {
      if (i < 50)
        t.forward(2);
      else
        if (i < 100)
        {
          t.right(3.6);
          t.forward(2);
        }
        else
          if (i < 150)
          {
            t.hideTurtle();
            
            t.right(3.6);
            t.forward(2);
          }
          
            
    }
}

private void draw(final Turtle t)
{
 new Thread()
 {
   public void run()
   {
     for (int i = 0; i < 5; i++)
       rect(t,30,50);
   }
 }.start();
}
  public static void main(String[] args)
  {
    new Tu7();
  }
}