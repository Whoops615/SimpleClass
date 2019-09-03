package by.htp.hame.main8.Task07;

public class TriangleLogic {



	public double square(Triangle tr) {

		double square;
		double halfPerimeter;
		halfPerimeter = perimeterTriangle(tr) / 2;
		square = Math.sqrt(halfPerimeter * (halfPerimeter - tr.getA()) * (halfPerimeter - tr.getB())
				* (halfPerimeter - tr.getC()));

		return square;
	}

	public double perimeterTriangle(Triangle tr) {

		double perimeter;
		perimeter = tr.getA() + tr.getB() + tr.getC();

		return perimeter;
	}

}
