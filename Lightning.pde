int startX=(int)(Math.random() * 250);
int startY=0;
int endX=0;
int endY=150;

void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);
  noLoop();
}
void draw()
{
  int redColor = (int)(Math.random()*256);
  int greenColor = (int)(Math.random()*256);
  int blueColor = (int)(Math.random()*256);
  while (endY < 300) {
    stroke(redColor, greenColor, blueColor);
    endX = (startX + (int)(Math.random() *20)-10);
    endY = (startY + (int)(Math.random() *10));
    line(startX, startY, endX, endY);
    startX=endX;
    startY=endY;
  }
}

void mousePressed()
{
  System.out.println("works");
  startX=(int)(Math.random() * 300);
  startY=0;
  endX=0;
  endY=150;
  redraw();
}
