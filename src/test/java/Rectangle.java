class Rectangle
{
    private int length;
    private int width;

    public Rectangle(int length,int width)  {
        this.length=length;
        this.width=width;
    } 

    public void draw() {
        for (int i2=0; i2<width; i2++){
            System.out.println();
            for (int j2=0; j2<length*2; j2++){
                System.out.print("*");
            }
        }
        System.out.println();
        for (int i=0; i<width; i++){
            System.out.println();
            for (int j=0; j<length; j++){
                System.out.print("*");
            }
        }
        System.out.println();

    }

    public void calcArea() {
        int area = this.length*this.width;
        System.out.println("The area for the big rectangle is " +area*2);
        System.out.println("The area for the small rectangle is " +area);

    }

    public void calcPerimeter() {
        int perimeter = 2*this.length+2*this.width;
        int bigperimeter = 4*this.length+2*this.width;
        System.out.println("The perimeter for the big rectangle is " +perimeter);
        System.out.println("The perimeter for the small rectangle is " +bigperimeter);

    }

    public void scale(int factor) {
        this.length = this.length*factor;
        this.width = this.width*factor;
        System.out.println("The length and width have multiplied by " +factor + "!!");
    }

    public String toString(){
        return ("Length of the small rectangle: " + this.length + ". Width of the small rectangle: " + this.width + ". Length of the big rectangle: " + this.length*2 + ". Width of the big rectangle: " + this.width);
    }

}