package _03_polymorphs;

import java.awt.Graphics;
import java.util.Random;

public abstract class Polymorph {
  protected  int x;
  protected  int y;
    
  int height=50;
  int width=50;
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    public int getX() {
    	return x;
    }
    public void setX(int x) throws Exception{
    	this.x=x;
    }
    public int getY() {
    	return y;
    }
    public void setY(int y) throws Exception{
    	this.y=y;
    }
    public void update(){
    	
    }
    
    public abstract void draw(Graphics g);
}
