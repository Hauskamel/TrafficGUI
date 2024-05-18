package TrafficGUI;

import TrafficGUI.road.Road;
import TrafficGUI.road.Strip;
import TrafficGUI.Car.Car;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TrafficGUI extends JPanel {
    private Road road;
    private Car car;
    private ArrayList<Strip> strips;


    public TrafficGUI() {
        // Background
        setBackground(Color.lightGray);

        // Road
        road= new Road(0, 0, 600, 600, Color.darkGray);
        car= new Car(40, 70, 60, 220, Color.yellow);

        strips= new ArrayList<>();


        // ### STRIPS ###
        // # Strips Config #
        int roadWidth= road.width;
        int roadHeight= road.height;
        int stripHeight= 70;
        int stripWidth= 5;

        int gap= 40;
        int positionY=40;


        // # Vertical Stirps #

        // Creates 5 Strips
        for (int i= 0; i < 5; i++) {
            Strip strip = new Strip(300, positionY, stripHeight, stripWidth, Color.white); // Create a new Strip object
            strips.add(strip);
            positionY += (gap + stripHeight);
        }



        // # Horizontal Strips #

        // Creates 5 Strips
        positionY=40;
        for (int i= 0; i < 5; i++) {
            Strip strip = new Strip(positionY, 300, stripWidth, stripHeight, Color.white); // Create a new Strip object
            strips.add(strip);
            positionY += (gap + stripHeight);
        }


    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        road.draw(g);
        car.draw(g);

        for (Strip strip : strips) {
            strip.draw(g);
        }


    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        TrafficGUI trafficLight = new TrafficGUI();
        frame.add(trafficLight);
        frame.setVisible(true);
    }
}
