package exercise3;

public class GameObject {

    //Instance Variables

    private double centerX;
    private double centerY;
    private double velocity;
    private boolean state;
    private double rotation;

    //constructor

    public GameObject(double centerX, double centerY, double velocity, boolean state, double rotation) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getVelocity() {
        return velocity;
    }

    public boolean isState() {
        return state;
    }

    public double getRotation() {
        return rotation;
    }


    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

}
