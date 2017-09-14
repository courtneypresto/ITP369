public class SortTacos implements Comparable<Taco> {

	public int compareTo(Taco one, Taco two) {
		// TODO Auto-generated method stub
		return (one.getTacoType()).compareTo(two.getTacoType());
	}

	@Override
	public int compareTo(Taco o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
