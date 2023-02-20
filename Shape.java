

/*1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code*/


public interface Shape {

  public double calculateArea();
  public double calculatePerimiter();
 }
   class Circle implements Shape {
     double radius;
      public Circle(double radius) {
           this.radius = radius;
       }
          @Override
       public double calculateArea() {
           return Math.PI * (radius * radius);
       }

       public double calculatePerimiter() {
           return 2 * Math.PI * radius;
       }
   }
     class Square implements Shape {
       double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
        @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
    public double calculatePerimiter() {
        return 4 * sideLength;
    }
}