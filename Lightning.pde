int startX=0;
int startY=150;
int endX=150;
int endY=0;

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
	while (endX < 300) {
		stroke(redColor, greenColor, blueColor);
		endX = (startX + (int)(Math.random() *10));
		endY = (startY + (int)(Math.random() *20)-10);
		line(startX, startY, endX, endY);
		startX=endX;
		startY=endY;
	}
}
void mousePressed()
{
	redraw();
}
