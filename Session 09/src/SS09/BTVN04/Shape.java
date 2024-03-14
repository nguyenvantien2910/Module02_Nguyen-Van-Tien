package SS09.BTVN04;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract float getArea();
    public void display() {
        System.out.println("Màu sắc : " + this.color);
    }
}