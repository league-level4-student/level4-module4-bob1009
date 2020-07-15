import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Cake> cakes = new ArrayList<Cake>();
		Random ran = new Random();
		readyMadeCake rmc = new readyMadeCake(null, 4, 30);
		orderCake oc = new orderCake(null, 7, 10);
		for (int i = 0; i < 20; i++) {
			int rand = ran.nextInt(1);
			if (rand == 0) {
				cakes.add(rmc);
			} else {
				cakes.add(oc);
			}
		}
		int counter = 0;
		double ocfp = 0;
		for (int i = 0; i < cakes.size(); i++) {
			if (cakes.get(i) == rmc) {
				counter += 1;
			} else {
				ocfp = oc.calcPrice();
			}
		}
		int rmcfp = counter * 4;
		double whole = rmcfp + ocfp;
		JOptionPane.showMessageDialog(null, "" + whole);

		if (ocfp > rmcfp) {
			JOptionPane.showMessageDialog(null, "the order cake sold for more");
		}
		else if(ocfp<rmcfp) {
			JOptionPane.showMessageDialog(null, "the ready made cake sold for more");
		}
		else {
			JOptionPane.showMessageDialog(null, "they both sold for the same price");
		}
	}
}
