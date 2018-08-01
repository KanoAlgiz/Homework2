package localhost;

public class Main {
	private static double square2(double x1, double y1 , double x2, double y2){
		double xside, yside;
		if (y1 > y2){
			yside = y1 - y2;
		} else {
			yside = y2 - y1;
		}

		if (x1 > x2){
			xside = x1 - x2;
		} else {
			xside = x2 - x1;
		}

		return xside * yside;
	}

	private static double square(double x1, double y1 , double x2, double y2){
		if (y1 > y2){
			y1 = y1 - y2;
		} else {
			y1 = y2 - y1;
		}

		if (x1 > x2){
			x1 = x1 - x2;
		} else {
			x1 = x2 - x1;
		}

	return x1 * y1;
	}
    public static void main(String[] args) {
		System.out.println(square(0.5, 0.5, -0.5, -0.5));
}
}
