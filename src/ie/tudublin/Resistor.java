//C17390923 - STUDENT NUM
//NAME - GLENN MOORE
//OOP SEM 2 LAB TEST 10TH APRIL 

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor()
    {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);
    }

    public Resistor(TableRow tr)
    {

    }
}