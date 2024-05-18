package TrafficGUI.road;

import java.awt.*;

public class Road {
    int positionX;
    int positionY;
    public int width;
    public int height;
    private Color color;

    public Road (int positionX, int positionY, int width, int height, Color color) {
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
