package SS08.BTVN01;

import ThucHanh03.rikkei.academy.Circle;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
//cal volume
    public void calVolume() {
        this.volume = Math.round(this.getRadius()* this.getRadius() * Math.PI);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                "height=" + this.getHeight() + '\'' +
                ", volume=" + this.getVolume() +
                '}';
    }
}
