import java.util.Calendar;

//this is the model of all foods
public abstract class Food {
	boolean isTuesday=false;
	
	public Food() {
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
