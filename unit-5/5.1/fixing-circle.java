Circle.java:
-----------
 public class Circle {

	private double radius;

	public Circle(double myRadius) {
		radius = myRadius;
	}

    public void setRadius(int myRadius){
        radius = myRadius;
    }

	public double getDiameter() {
		return radius*2;
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return Math.PI*getDiameter();
	}

	public String toString() {
		return "Circle with a radius of " + radius;
	}
}

CircleTester.java:
-----------------
public class CircleTester {

	public static void main(String[] args) {

		Circle circ = new Circle(5);
		
		
        
        System.out.println(circ);

        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());

	}

}

