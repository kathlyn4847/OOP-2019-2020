package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//syntax for arrays
	//float[] rainfall = new float[12];//one way to make an array

	// to hardcode constant values in array
	float[] rainfall = {45 ,37 ,55 , 27, 38, 50 , 79, 48, 104, 31, 100, 58}; 

	//rainfall numbers are integers 
	// 50.0 is a double constant - 8 bytes for ouble, 4 bytes for float 
	//lose precision when double is put into a float 
	//50.0 double constant - 50.0f float constant


	//array of strings
	//' ' char , "" string 
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		//iterate over an array
		for(int i = 0; i < rainfall.length; i++)
		{
			//becuase in Papplet can use println
			println(months[i] + "\t" + rainfall[i]);
		}
		Min();
		Max();
	}

	//for each loop / enhance for loop used for iterating over collections/arrays
	//no longer have an index
	//for(float f:rainfall)
	//{
		//println(f);
	//}
	
	/*for(String s:months)
	{
		println(s);
	}*/

	float offset = 0;

	
	public void Min()
	{
		int minIndex = 0;

		for(int i = 1; i<rainfall.length; i++)
		{
			if (rainfall[i] < rainfall[minIndex])
			{
				minIndex = i;
			}
		}

		println(months[minIndex] + "The minimum rainfall of" + rainfall[minIndex]);
	}

	public void Max()
	{
		int maxIndex = 0;

		for(int i = 1; i<rainfall.length; i++)
		{
			if (rainfall[i] > rainfall[maxIndex])
			{
				maxIndex = i;
			}
		}

		println(months[maxIndex] + "The minimum rainfall of" + rainfall[maxIndex]);
	}



	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		drawBarChart();
	}

	public void drawBarChart()
	{
	// 	int width = 20;
	// 	// int height =-400;
	// 	int y = 500;
	// 	int x = 20;
	// 	int c =20;
	// 	colorMode(HSB);	
	// 	for (int i = 0; i < rainfall.length ; i++)
	// 	{
	// 		fill(c, 255, 255);
	// 		rect(x,y, width, -rainfall[i]);

	// 		x = x+ 30;
	// 		c += 10;

	// 	}

		float w = width / rainfall.length;
		float cGap = 255 / rainfall.length;

		noStroke();
		colorMode(HSB);

		for(int i = 0 ; i < rainfall.length ; i++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect (x, height, w, 5* -rainfall[i]);
		}
	}
}
