package TrafficGUI.Car;

import java.awt.*;

public class Car {
    int width;
    int height;
    public int positionX;
    public int positionY;
    private Color color;

    public Car (int width, int height, int positionY, int positionX, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

}
