public class ShapeTester {

    public static void main(String[]args){

        Circle circle=new Circle(5.0);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimiter());

        Square square=new Square(2.0);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimiter());

        }

    }

