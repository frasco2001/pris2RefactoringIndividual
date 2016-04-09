package act3;

public abstract class Price {

	abstract int getPriceCode();

	// 13
	abstract double getCharge(int daysRented);
}

class ChildrensPrice extends Price {
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	// 13
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}

class NewReleasePrice extends Price {
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	// 13
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
}

class RegularPrice extends Price {
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	// 13
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
}
