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
}
