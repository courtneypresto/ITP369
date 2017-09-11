import java.util.List;

public class ChickenTaco extends Taco{
	PlatterSize mPlatterSize;
	List <String>toppingsOnThisTaco;

	public ChickenTaco (PlatterSize ps) {
		super();
		mPlatterSize = ps;
		this.typeOfTaco = "chicken";
	}
	
	public void AddTopping(String topping) {
	 toppingsOnThisTaco.add(topping);
	}
	
	//returns a pretty toppings string
	public String gettToppingsString() {
		if(toppingsOnThisTaco.isEmpty()) {
			return "no toppings";
		}
		String temp = "";
		for(int i =0; i < toppingsOnThisTaco.size();i++) {
			if(i == toppingsOnThisTaco.size()-1 && toppingsOnThisTaco.size() >1) { // indicates last topping
				temp += "and";
			}
			temp += toppingsOnThisTaco.get(i);
			if(i != toppingsOnThisTaco.size()-1) {
				temp += ", ";
			}
		}
			return temp;
	}
}