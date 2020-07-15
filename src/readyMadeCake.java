import java.util.Random;

public class readyMadeCake extends Cake{
	Random ran=new Random();
	public readyMadeCake(String n, double r, double quantity) {
		super(n, r);
	}

	@Override
	public double calcPrice() {
		
		return 0;
	}

}
