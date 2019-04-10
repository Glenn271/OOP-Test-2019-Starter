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
	
	public void draw()
	{			
	}
}
