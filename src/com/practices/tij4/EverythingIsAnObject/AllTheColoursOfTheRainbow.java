package com.practices.tij4.EverythingIsAnObject;

import java.awt.*;

public class AllTheColoursOfTheRainbow {

    int anIntRepresentsColours;

    public static void main(String[] args) {
        AllTheColoursOfTheRainbow coloursOfTheRainbow =  new AllTheColoursOfTheRainbow();
        coloursOfTheRainbow.changeHueOfTheColour(Color.RED);
        System.out.println(coloursOfTheRainbow.anIntRepresentsColours);

    }

    void changeHueOfTheColour(Color color) {
        anIntRepresentsColours = color.getRGB();

    }
}
