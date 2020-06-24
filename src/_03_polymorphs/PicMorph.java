package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PicMorph extends Polymorph {
 BufferedImage pic;
	PicMorph(int x, int y) {
		super(x, y);
		try{
			 pic = ImageIO.read(this.getClass().getResourceAsStream("Shrek.jpg"));
			}catch(Exception e){
			}
	}
	@Override
	public void draw(Graphics g) {
		g.drawImage(pic, x, y, 50, 50, null);
	}

}
