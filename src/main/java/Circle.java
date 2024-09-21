class Circle
{
    private int radius;

    public Circle(int radius)  {
        this.radius=radius;
    } 

    public double area() {
        return (this.radius*this.radius*Math.PI);

    }
}