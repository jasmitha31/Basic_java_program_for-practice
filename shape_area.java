public class shape {
	public shape(double r) {
		System.out.println("it is circle of the radius"+r);
	}
	public shape(double l, double b) {
		System.out.println("it is rectangle of the lenght and breath" +l+b);
	}
	public shape(double l, double b,double h) {
		System.out.println("it is rectangle of the lenght and breath and height"+l+b+h);
	}

	public double area(double r) {
		return 3.14*r*r;
	}
	public double area(double l, double b) {
		return l*b;
	}
	public String area(double l, double b,double h) {
		return l*b*h;
	}
	public static void main(String[] args) {

		shape s1 = new shape(5.2);
		shape s2 = new shape(5,2);
		shape s3 = new shape(5,10,5);
		shape s = new shape();
		double area1 =s.area(5);
		double area2 =s.area(5,10);
		double area3 =s.area(5,2,10);
		System.out.println("area");
		System.out.println("Result 1: " +area1);
		System.out.println("Result 2: " + area2);
		System.out.println("Result 3: " + area3);
	}
}
