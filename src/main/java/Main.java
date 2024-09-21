import java.util.*;
class Main
{ 
	  Scanner reader = new Scanner(System.in);
	  public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(4);
        double areaC1 = c1.area();
        double areaC2 = c2.area();
        System.out.println("The area of the first circle is: " + areaC1);
        System.out.println("The area of the second circle is: " + areaC2);




      } 
    }