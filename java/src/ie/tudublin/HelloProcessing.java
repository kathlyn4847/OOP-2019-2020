package ie.tudublin;

import processing.core.PApplet;

//extends is inheritance papplet super class every papplet has gets brought into HelloProcessing
public class HelloProcessing extends PApplet
{	
	//executed at the very start and once method from pApplet 
	public void settings()
	{
		size(500, 500);
	}


	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	//its in a loop executed 60 times every second
	public void draw()
	{	
		
		//background(0);
		//noStroke();
		//fill(255);
		//ellipse(x, mouseY, 50, 50);		
		//x ++;


		//set colours 
		//background(255, 0, 0);
		//change colour of outline
		//stroke(0, 0, 255);
		//fills all shapes  will fill everyhting after it
		//fill(0, 0, 255);
		//no outline on any shapes 
		//noStroke();

		//line(10, 10, 100, 100);//x1,y1,x2,y2
		//point (50, 50);// x, y
		//ellipse(100, 200, 100, 50);// cx cy, w, h
		//rect(70,150,90,10);//top left x , top left y , width , height
		//triangle(150, 90, 200, 100, 100, 250);

		//drawing task github
		noStroke();
		background(255, 0, 0);
		fill(255,255,0);
		ellipse(250,300,400,400);
		fill(0,255,255);
		triangle(440,470,250,50,60,470);//x1y1, x2y2,x3y3
		fill(204,204,204);
		ellipse(250,250,170,90);
		fill(0);
		ellipse(250,250,60,60);

	}
}
