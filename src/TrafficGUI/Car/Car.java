package TrafficGUI.Car;

import java.awt.*;

public class Car {
    int width;
    int height;
    public int positionX;
    public int positionY;
    private Color color;

    public boolean isCarMoving() {
        return carMoving;
    }

    public void setCarMoving(boolean carMoving) {
        this.carMoving = carMoving;
    }

    private boolean carMoving;


    public Car(int width, int height, int positionY, int positionX, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.carMoving = false;
    }

    public void drive() {

        if (this.width < this.height) {
            this.positionY += 1;
        }

        if (this.width > this.height) {
            this.positionX += 1;

        }


    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

}
