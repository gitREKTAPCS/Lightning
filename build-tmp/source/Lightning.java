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

int startX=(int)(Math.random() * 250);
int startY=0;
int endX=0;
int endY=150;
int redColor;
int greenColor;
int blueColor;

public void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);
  noLoop();
}
public void draw()
{
	
  while (endY < 300) {
  	redColor = (int)(Math.random()*256);
	greenColor = (int)(Math.random()*256);
	blueColor = (int)(Math.random()*256);
    stroke(redColor, greenColor, blueColor);
    endX = (startX + (int)(Math.random() *20)-10);
    endY = (startY + (int)(Math.random() *10));
    line(startX, startY, endX, endY);
    startX=endX;
    startY=endY;
  }
  clouds();
}

public void mousePressed()
{
  System.out.println("works");
  startX=(int)(Math.random() * 300);
  startY=0;
  endX=0;
  endY=150;
  redraw();
}

public void clouds(){
	noStroke();
	fill(redColor,greenColor, blueColor);
	ellipse(50, 30, 120, 120);
	ellipse(100, 30, 120, 120);
	ellipse(150, 30, 120, 120);
	ellipse(200, 30, 120, 120);
	ellipse(250, 30, 120, 120);
	
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
