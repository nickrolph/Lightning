int startPointX = 0;
int startPointY = 150;
int endPointX = 150;
void setup()
{
  size(300,300);
  background(0);
}
void draw()
{
	strokeWeight(8);
	stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	while (endPointX < 300) {
	int xRandom = (int)(Math.random()*8 +1);
	int yRandom = ((int)(Math.random() * 19)-9);
	endPointX = startPointX + xRandom;
	int endPointY = startPointY + yRandom;
	line(startPointX,startPointY, endPointX, endPointY);
	startPointX = endPointX;
	startPointY = endPointY;
	
	}
	
}
void mousePressed()
{
 startPointX = 0;
 startPointY = 150;
 endPointX = 150;
}

