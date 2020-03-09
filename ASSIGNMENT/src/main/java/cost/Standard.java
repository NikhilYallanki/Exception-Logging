package cost;

public class Standard {
	private double costPSF = 1500;
	public double costIS(double Area) {
		return Area*costPSF;
	}
}
