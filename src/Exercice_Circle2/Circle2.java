package Exercice_Circle2;

public class Circle2 { //Save as Circle2.java
	   private double radius;
	   
	   public Circle2() {  // 1st (default) constructor
		      this.radius = 1.0;
	   }
	   
	   public Circle2(double r) {  // 2nd constructor
		      this.radius = r;
	   }

	   public double getRadius2() {
		   return radius;
	   }
	   
	   public double getArea2() {
		   return radius*radius*Math.PI;
	   }
	   
	   public double getCircumference() {
		   return radius+radius+Math.PI;
	   }

	   public void setRadius(double radius) {
		   this.radius = radius;
	   }
	   
	   public String toString() {
		   return "Circle[radius= " + radius + "]";
	   }
}
