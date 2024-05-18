package TrafficGUI.road;

import java.awt.*;

public class Strip {
    int positionX;
    int positionY;
    int height;
    int width;
    private Color color;

    public Strip (int positionX, int positionY, int height, int width, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

}
