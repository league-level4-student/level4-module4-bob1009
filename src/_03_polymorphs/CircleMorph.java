package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
int height = 50;
int width = 50;
double angle = 0;

public CircleMorph(int x, int y) {
	super(x, y);
}
public void update() {
	x+=Math.sin(angle)*100;
	y+=Math.cos(angle)*100;
	angle+=5;
}
@Override
public void draw(Graphics g) {
	g.setColor(Color.green);
	g.fillRect(x, y, width, height);
}
}
