package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph Movingmorph;
    Polymorph Circle;
    Polymorph Follow;
    Polymorph pic;
    Polymorph click;
    ArrayList <Polymorph> Polys=new ArrayList <Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly  = new RedMorph(25, 50);
   	 Movingmorph= new MovingMorph(75, 50);
   	 Circle = new CircleMorph(100, 50);
   	 Follow = new FollowMorph(125, 50);
   	 click = new ClickMorph(150, 50);
   	 pic = new PicMorph(150, 50);
   	 Polys.add(bluePoly);
   	 Polys.add(redPoly);
   	 Polys.add(Movingmorph);
   	 Polys.add(Circle);
   	 Polys.add(Follow);
   	 Polys.add(pic);
   	 Polys.add(click);
   	 window.addMouseMotionListener((FollowMorph) Follow);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 window.addMouseListener((ClickMorph) click);
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph Draw : Polys) {
   		 Draw.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph Up : Polys) {
		Up.update();
	}
    }
}
