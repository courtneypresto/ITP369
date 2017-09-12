import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stand {

	static Map <String, Double> availableToppings;
	static boolean done =false;
	static InputHelper inputHelper;
	static List<Taco> tacosInThisOrder;
	
	public Stand() {
		tacosInThisOrder = new ArrayList<Taco>();
		availableToppings = new HashMap<String,Double>();
		availableToppings.put("salsa", 0.0);
		availableToppings.put("lettuce", 0.0);
		availableToppings.put("beans", 0.0);
		availableToppings.put("corn", 0.0);
		availableToppings.put("guac", 1.0);
	}
	
	// this will be where we test our functions
	public static void main(String[] args) {
		Stand stand = new Stand();
		System.out.println("Welcome to Buenos Tacos!");
		while(!done) {
			PrintMenu();
			int choice = inputHelper.readIntBetween("", 1, 4);
			if(choice == 1) {
				AddTacoPlatter();
			}
			if (choice ==2) {
				ViewOrder();
			}
			if (choice ==3 ) {
				Checkout();
				done = true;
			}
			if (choice ==4) {
				CancelOrder();
				done = true;
			}
			
		}
		
	}
	
	private static void CancelOrder() {
		// TODO cancel order message 
		System.out.println("Cancelling order. FOR REFERENCE: " + PrettyPrint() + "\nGood Bye!");
		
	}

	private static void Checkout() {
		// TODO -- print checkout message
		String prompt = "You owe: $";
		double price = 0;
		for (Taco t : tacosInThisOrder) {
			price += CalculatePrice(t);
		}
		prompt += price+ " \nPlease see CASHIER \nGood Bye!";
		System.out.println(prompt);
		
	}

	private static void ViewOrder() {
		// TODO -- output string summary of order with price
		System.out.println(PrettyPrint());
		
	}

	private static void AddTacoPlatter() {
		//TODO -- prompt user to create taco and add it to the array of tacos
		System.out.println("Please select a protein:");
		int meat = InputHelper.readIntBetween("1. Chicken", 1, 1);
		Taco t;
		String prompt = "Please select a platter size: \n 1. Pequeno \n 2. Medio \n 3.Grande";
		int platterSize = InputHelper.readIntBetween(prompt, 1, 3);
		PlatterSize ps = getPlatterSizeFromInputString(platterSize);
		t = getTacoTypeFromInputString(meat, ps);
		addToppings(t);
		tacosInThisOrder.add(t);
		
		
	}
	public static PlatterSize getPlatterSizeFromInputString(int platterSize) {
		
		if (platterSize ==1) {
			return PlatterSize.PEQUENO;
		}
		else if(platterSize == 2) {
			return PlatterSize.MEDIO;
		}
		else {
			return PlatterSize.GRANDE;
		}
	}
	public static Taco getTacoTypeFromInputString(int meat, PlatterSize ps) {
		if(meat == 1) {
			 return new ChickenTaco(ps);
			 
			
		}
		return new ChickenTaco(ps);
	}
	public static void addToppings(Taco t) {
		boolean toppingsDone =false;
		while(!toppingsDone) {
			String prompt = "Please select toppings: \n 1. Salsa \n 2. Lettuce \n 3. Beans \n 4. Corn \n 5. Guac \n 6. Done";
			int topping = InputHelper.readIntBetween(prompt, 1, 6);
			switch (topping) {
			case 1: 
				t.AddTopping("salsa");
				break;
			case 2: 
				t.AddTopping("lettuce");
				break;
			case 3:
				t.AddTopping("beans");
				break;
			case 4:
				t.AddTopping("corn");
				break;
			case 5: 
				t.AddTopping("guac");
				break;
			case 6:
				toppingsDone = true;
				break;
			default: 
				break;
			}
		}
	}
	public static void PrintMenu() {
		System.out.println("Please select from the following menu items:");
		System.out.println("1: Order Taco Platter");
		System.out.println("2: View Order");
		System.out.println("3: Checkout");
		System.out.println("4: Cancel/Quit");
	}
	public static String PrettyPrint() {
		
		// uncomment this line when comparable is implemented
		//Collections.sort(tacosInThisOrder);
		String temp = "This order contains:\n";
		if(tacosInThisOrder.isEmpty()) {
			temp += "no tacos";
		}
		for(Taco t : tacosInThisOrder) {
			temp += " a " + getPlatterString(t.mPlatterSize)+ " "+ t.typeOfTaco + " with " + t.getToppingsString() + " which costs " + CalculatePrice(t);
			temp+="\n";
		}
		
		return temp;
	}
	public static String getPlatterString(PlatterSize ps) {
		if (ps == PlatterSize.PEQUENO) {
			return "pequeno";
		}
		else if (ps == PlatterSize.MEDIO) {
			return "medio";
			
		}
		else {
			return "grande";
		}
	}
	private static double CalculatePrice(Taco t) {
		double price = t.mPlatterSize.price;
		for (int i =0 ; i < t.toppingsOnThisTaco.size(); i++) {
			Double temp = availableToppings.get(t.toppingsOnThisTaco.get(i));
			if(temp != null) {
				price += temp;
			}
			else {
				price += 0;
			}
		}
		return price; 
	}
}
