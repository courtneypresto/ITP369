import java.util.Calendar;

//this is the model of all foods
//food class is complete
public abstract class Taco {
	boolean isTuesday=false;
	
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
	
	

}
