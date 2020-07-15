import java.util.Random;

public class orderCake extends Cake{
Random ran=new Random();
double rand=ran.nextInt(7);
double weight=rand;
public orderCake(String n, double r, double weight) {
		super(n, r);
		
	}

	
	@Override
	public double calcPrice() {
		double ocfp=weight*7;
		return ocfp;
	
	}


	
}
