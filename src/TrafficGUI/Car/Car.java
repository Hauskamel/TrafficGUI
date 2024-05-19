package TrafficGUI.Car;

import java.awt.*;

public class Car {
    int width;
    int height;
    public int positionX;
    public int positionY;
    private Color color;
    int carMoving= 1;


    public Car (int width, int height, int positionY, int positionX, int carMoving, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.carMoving = carMoving;
    }

    public void drive () {

        if (this.width < this.height) {
                this.positionY+=1;
        }

        if (this.width > this.height) {
            if (this.positionX == 110) {
                this.positionX= 110;
            } else {
                this.positionX+=1;
            }
        }



    }

    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

}
