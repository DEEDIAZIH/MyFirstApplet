
import java.awt.Graphics;
import javax.swing.JApplet;

/*
 * importjavax.swing.JApplet
 * importjava.awt.Graphics
 * 
 */

/**
 *
 * @author Azih Chiamaka
 */

public class MyFirstApplet extends JApplet
  {
public void paint(Graphics canvas)    
   {
super.paint(canvas);
canvas.drawOval(100,50,200,200);
canvas.fillOval(155,100,10,20);
canvas.fillOval(230,100,10,20);
canvas.drawArc(150,160,100,50,180,180);
   }
 }