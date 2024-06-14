package TrafficGUI.Car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car implements Runnable {
    int width;
    int height;
    public double positionX;
    public double positionY;
    private Color color;
    private Timer timer;
    double velocity;
    boolean running;
    int d;


    public Car(int width, int height, int positionY, int positionX, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.color = color;
        this.velocity = 1; // Entspricht 10 km/h
        d = 100;
        this.running = true;
    }

    @Override
    public void run() {

        while (running) {
            drive();

            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }

    public void drive() {

        if (this.width < this.height) {
            this.positionY += velocity;
        }

        if (this.width > this.height) {
            this.positionX += velocity;

        }
    }

    public double getX () {
        return positionX;
    }

    public double getY () {
        return positionY;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int)positionX, (int)positionY, width, height);
    }
}
