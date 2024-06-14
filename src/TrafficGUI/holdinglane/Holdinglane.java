package TrafficGUI.holdinglane;

import java.awt.*;

public class Holdinglane {
    public int positionX;
    public int positionY;
    public int width;
    public int height;
    Color color;

    public Holdinglane (int positionX, int positionY, int width, int height, Color color) {
        this.positionX= positionX;
        this.positionY= positionY;
        this.width= width;
        this.height= height;
        this.color = color;
    }

    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }
}
