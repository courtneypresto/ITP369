import java.util.List;

public class ChickenTaco extends Taco{
	PlatterSize mPlatterSize;
	

	public ChickenTaco (PlatterSize ps) {
		super();
		mPlatterSize = ps;
		this.typeOfTaco = "chicken";
	}
	
	public void AddTopping(String topping) {
	 toppingsOnThisTaco.add(topping);
	}
	
	
}
