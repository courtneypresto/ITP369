import java.util.Calendar;
import java.util.List;

//this is the model of all foods
//food class is complete
public abstract class Taco {
	boolean isTuesday=false;
	String typeOfTaco;
	List <String>toppingsOnThisTaco;
	
	public Taco() {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 

		switch (day) {
		    case Calendar.TUESDAY:
		        isTuesday=true;
		        break;
		    default: 
		    	break;
		}
	}
	
	public void AddTopping(String topping) {
		 toppingsOnThisTaco.add(topping);
		}
	
	//returns a pretty toppings string
		public String getToppingsString() {
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
