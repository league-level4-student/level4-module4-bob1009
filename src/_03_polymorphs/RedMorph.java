package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{
	int width = 50;
	int height = 50;
RedMorph(int x, int y) {
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
public void draw(Graphics g) {
	g.setColor(Color.red);
	g.fillRect(x, y, width, height);
}
}
