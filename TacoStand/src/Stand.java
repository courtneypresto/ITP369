import java.util.List;
import java.util.Map;

public class Stand {

	Map <String, Double> availableToppings;
	static boolean done =false;
	static InputHelper inputHelper;
	List<TacoPlatter> tacoPlattersInThisOrder;
	
	// this will be where we test our functions
	public static void main(String[] args) {
		
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
			}
			if (choice ==4) {
				CancelOrder();
			}
			
		}
		
	}
	
	private static void CancelOrder() {
		// TODO cancel order message 
		
	}

	private static void Checkout() {
		// TODO -- print checkout message
		
	}

	private static void ViewOrder() {
		// TODO -- output string summary of order with price
		
	}

	private static void AddTacoPlatter() {
		//TODO -- prompt user to create taco and add it to the array of tacos
	}

	public static void PrintMenu() {
		System.out.println("Please select from the following menu items:");
		System.out.println("1: Order Taco Platter");
		System.out.println("2: View Order");
		System.out.println("3: Checkout");
		System.out.println("4: Cancel/Quit");
	}

}