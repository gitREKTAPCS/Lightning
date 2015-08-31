import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=0;
int startY=150;
int endX=150;
int endY=0;

public void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);
  noLoop();
}
public void draw()
{
	int redColor = (int)(Math.random()*256);
	int greenColor = (int)(Math.random()*256);
	int blueColor = (int)(Math.random()*256);
	while (endX < 300) {
		stroke(redColor, greenColor, blueColor);
		endX = (startX + (int)(Math.random() *10));
		endY = (startY + (int)(Math.random() *20)-10);
		line(startX, startY, endX, endY);
		startX=endX;
		startY=endY;
	}
}
public void mousePressed()
{
	redraw();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
