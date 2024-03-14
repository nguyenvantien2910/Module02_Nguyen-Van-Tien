package SS09.BTVN04;

public class Circle extends Shape{
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * this.radius);
    }
}
