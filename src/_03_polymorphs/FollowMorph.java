package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowMorph extends Polymorph implements MouseMotionListener{
int height = 50;
int width = 50;
public FollowMorph(int x, int y) {
	super(x, y);
}
public void Update() {
	 
}
@Override
public void draw(Graphics g) {
	g.setColor(Color.PINK);
	g.fillRect(x, y, width, height);
}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	x=e.getX();
	y=e.getY();
}
}
