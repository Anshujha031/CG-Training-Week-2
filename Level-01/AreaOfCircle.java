import java.util.*;

class Circle{
	public double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	
	public double area(){
		double a = 3.14*(radius)*(radius);
		return a;
	}
	
	public void display(){
		System.out.println(" circle details: ");
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + area());
	}
	
}

class AreaOfCircle{
	public static void main(String[] args){
		Circle c = new Circle(10);
		c.display();
		
	}
}