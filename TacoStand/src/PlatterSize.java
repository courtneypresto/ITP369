//ENUM is finished
public enum PlatterSize {
PEQUENO(3.0,1),MEDIO(4.0,2),GRANDE(5.0,3);

	double price;
	int numberOfTacos;
	
	private PlatterSize(double price, int number) {
		this.price= price;
		this.numberOfTacos= number;
	}

	public double getPrice() {
		return price;
	}

	public int getDiameter() {
		return numberOfTacos;
	}

};
