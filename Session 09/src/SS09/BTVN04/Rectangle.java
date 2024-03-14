package SS09.BTVN04;

public class Rectangle extends Shape {
    private float width, height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, float width, float height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public float getArea() {
        return height * width;
    }
}
