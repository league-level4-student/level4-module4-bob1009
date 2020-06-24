package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class MovingMorph extends Polymorph{
	int height = 50;
	int width = 50;
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
public void update() {
		x+=1;
	}
public	MovingMorph(int x, int y){
	super(x, y);
}
@Override
public void draw(Graphics g) {
	g.setColor(Color.yellow);
	g.fillRect(x, y, width, height);
	
}
}
