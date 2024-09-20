import java.util.*;
class Main
{ 
	  Scanner reader = new Scanner(System.in);
	  public static void main(String[] args) {

        Rectangle r1 = new Rectangle(11, 3);
        r1.draw();
        r1.calcArea();
        r1.calcPerimeter();
        System.out.println(r1.toString());
        r1.scale(2);
        r1.calcArea();



      } 
    }
