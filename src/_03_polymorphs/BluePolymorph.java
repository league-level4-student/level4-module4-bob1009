package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
 int width=50;
 int height=50;
	BluePolymorph(int x, int y) {
		super(x, y);
	}
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
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
	
}
