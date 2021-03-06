//C17390923 - STUDENT NUM
//NAME - GLENN MOORE
//OOP SEM 2 LAB TEST 10TH APRIL 

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void loadColours() {

		Table table;

		table = loadTable("colours.csv","header");

		for (TableRow row : table.rows())
		{
			/*
			String colour = row.getString("colour");
			int r = row.getInt("r");
			int g = row.getInt("g");
			int b = row.getInt("b");
			int value = row.getInt("value");
			*/

			Colour c = new Colour(row);
			colours.add(c);
		}
		printColours();
	}

	public void loadResistors()
	{
		Table table;

		table = loadTable("resistors.csv","header");

		for (TableRow row : table.rows())
		{
			Resistor rn = new Resistor(row);
			resistors.add(rn);
		}

	}

	public void printColours()
	{
		for (int i = 0; i < colours.size(); i++)
		{
			System.out.println(colours.get(i));
		}
	}



	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);

	}

	public void setup() 
	{
		loadColours();
	}
	
	float gap = width * 0.125f;
	float x = (width/2) - gap;
	float y = (height/2) -gap;
	float w = 100;
	float h = 100;
	float lineSize = 50;
	float rectWidth = 10;
	

	public void renderR()
	{
		background(100,100,100);
		stroke(0);
		
		for (int i = 0; i <=3; i++){
			noFill();
			rect(x,y+(150*i),w,h);
			textAlign(RIGHT,CENTER);
			
			//text(resistors.get(i), width - gap, y +(150*i));
			//seperate(resistors.get(i));
			for (int j = 1; j <= 3; j++) {
			fill(255,0,0);
			rect(x+(rectWidth*j*2),y+(150*i),rectWidth,h);

			line(x, y - lineSize, x+lineSize, y-lineSize); 
			} 
		}
		
	}
	
	public void draw()
	{		
		renderR();			
	}
}
