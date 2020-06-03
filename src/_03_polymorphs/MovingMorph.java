package _03_polymorphs;

import java.util.Random;


public class MovingMorph {
void update(Polymorph morph) {
	int random;
	Random ran=new Random();
	for (int i = 0; i < 500; i++) {
		random=ran.nextInt(1);
		if (random==0) {
			morph.x+=1;
		}
		else {
			morph.y+=1;
		}
	}
	}
}
