package exercise3;

import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {

        double centerX = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of X-Center: "));
        double centerY = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of Y-Center: "));
        double velocity = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Value of Velocity: "));
        Boolean status = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Is object Alive? (Enter True or False): "));
        double rotation = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Angle of Rotation:"));


        GameObject object1 = new GameObject(centerX, centerY, velocity, status, rotation);

        



    }
    }
}
