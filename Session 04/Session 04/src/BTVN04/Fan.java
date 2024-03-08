package BTVN04;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean ON = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isON() {
        return ON;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, String color, double radius, boolean ON) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.ON = ON;
    }

    public String toString() {
        if (this.ON) {
            return String.format("Fan is on. Speed: %d, Color: %s, Radius: %.2f", speed, color, radius);
        } else {
            return String.format("Fan is off. Color: %s, Radius: %.2f", color, radius);
        }
    }
}

