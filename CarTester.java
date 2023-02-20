public class CarTester {

    public static void main(String[]args){
        Car t=new Truck(27000.0,"red",5000.0);
        System.out.println(t.calculateSalePrice());

        Car s=new Sedan(18000.0,"White",3000.0);
        System.out.println(s.calculateSalePrice());
    }
}
