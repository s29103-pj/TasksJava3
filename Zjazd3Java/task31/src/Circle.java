public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.color = "yellow";
        this.radius =  3.2;
    }
    public Circle(double radius){
        this.color = "red";
        this.radius =  radius;
    }
    public Circle(double radius,String color){
        this.color = color;
        this.radius =  radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color= color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return(Math.PI*Math.sqrt(radius));
    }

    public String toString() {
        return ("The circle has:\n radius of: "+radius+"\n and color: "+color+"\n and area :" + getArea());
    }
}