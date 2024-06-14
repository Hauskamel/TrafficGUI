package TrafficGUI;

import TrafficGUI.ampel.TrafficLight;
import TrafficGUI.ampel.TrafficLightGUI;
import TrafficGUI.road.Road;
import TrafficGUI.road.Strip;
import TrafficGUI.Car.Car;
import TrafficGUI.holdinglane.Holdinglane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TrafficGUI extends JPanel {
    private Road roadVertical;
    private Road roadHorizontal;
    private Car car;
    private Car car2;
    private ArrayList<Strip> strips;
    private Holdinglane holdinglane;
    private TrafficLight trafficLight;


    public TrafficGUI() {
        // Background
        setBackground(Color.lightGray);

        // ### ROAD ###
        roadVertical = new Road(0, 350, 800, 200, Color.darkGray);
        roadHorizontal = new Road(350, 0, 200, 800, Color.darkGray);
        holdinglane = new Holdinglane(365, 300, 70, 5, Color.green);
        strips = new ArrayList<>();


        // ### CARS ###
        car = new Car(40, 70, -70, 380, Color.yellow);
        car2 = new Car(70, 40, 380, -70, Color.green);


        // ### TRAFFIC LIGHT ###
        trafficLight = new TrafficLight(150, 150, 200, 100, 0);

        createStrips();
        animate();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        TrafficGUI trafficLight = new TrafficGUI();
        frame.add(trafficLight);
        frame.setVisible(true);
    }


    protected void createStrips() {

        // ### STRIPS ###
        // # Strips Config #
        int stripHeight = 70;
        int stripWidth = 5;

        int gap = 40;


        // # Vertical Stirps #

        // Creates 5 Strips
        int positionY = 40;
        for (int i = 0; i < 7; i++) {
            Strip strip = new Strip(445, positionY, stripHeight, stripWidth, Color.white); // Create a new Strip object
            strips.add(strip);
            positionY += (gap + stripHeight);
        }


        // # Horizontal Strips #

        // Creates 5 Strips
        // Position Y reset to 40px
        positionY = 40;
        for (int i = 0; i < 7; i++) {
            Strip strip = new Strip(positionY, 445, stripWidth, stripHeight, Color.white); // Create a new Strip object
            strips.add(strip);
            positionY += (gap + stripHeight);
        }

    }

    public void animate() {

        car.drive();
        car2.drive();

        repaint();

    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        roadVertical.draw(g);
        roadHorizontal.draw(g);
        car.draw(g);
        holdinglane.draw(g);
        car2.draw(g);
        trafficLight.draw(g);

        for (Strip strip : strips) {
            strip.draw(g);
        }

    }

    public void run() {
        while (true) {

        }
    }


}


