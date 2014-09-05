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

int startPointX = 0;
int startPointY = 150;
int endPointX = 150;
public void setup()
{
  size(300,300);
  background(0);
}
public void draw()
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
public void mousePressed()
{
 startPointX = 0;
 startPointY = 150;
 endPointX = 150;
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
