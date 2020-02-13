package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		/*
		background(0);		
		stroke(255);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);

		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}
		*/
		//mistake();
		//design1();
		//upsidedown();
		//grid();
		//rainbowcirclessquare();
		squares();
	
	}

	public void mistake()
	{
		background(255);		
		stroke(0);
		int x=0;
		int x2=500;
		int y2=500;
		int i = 500;
		
		line(0,0,500,500);

		for (i=500 ; i>0 ; i=i-10)
		{
			line(x,0,i,i);
			x= x+10;
		}
	}

	public void design1()
	{
		background(255);		
		stroke(0);
		int x=0;
		int y=500;
		int i=500;
		
		line(0,0,500,500);

		for (i=500 ; i>0 ; i=i-10)
		{
			line(x,0,y,500);
			y=y-10;
			x= x+10;
		}

		for (i=0; i<500; i=i+10)
		{
			line(500,y,0,x);
			y=y+10;
			x= x-10;
		}
	
	}

	public void circles()
	{
		int i =25;
		background(255);		
		stroke(0);
		ellipse(25, 25, 50, 50);



		for (i=25;i<500;i=i+50)
		{
			ellipse(i, 25, 50, 50);
		}
	}

	public void rainbowstripes()
	{
		colorMode(HSB);
		int x=0;
		int y=0;
		int i=0;
		int c=0;
		
		background(255);
		noStroke();
		//fill(colour, hue, saturation)
		//every 20 next colour in rainbow
		while(i!=10)
		{
			fill(c,255,255);
			rect(x, y, 50, 500); 
			i=i+1;
			c= c+20;
			x= x+50;
		}

	}

	public void rainbowcircles()
	{
		colorMode(HSB);
		int i =25;
		int c =0;
		background(255);		
		noStroke();
		ellipse(25, 25, 50, 50);



		for (i=25;i<500;i=i+50)
		{
			fill(c,255,255);
			ellipse(i, 25, 50, 50);
			c= c+20;
		}

	}

	public void grid()
	{
		background(0);
		stroke(0, 204, 0);
		int i=0;
		int y=50;
		int x=50;
		while(i!=11)
		{
			line(50,y,450,y);
			i = i+1;
			y = y+40;
		}

		i=0;

		line(50,50,50,450);

		while(i!=11)
		{
			line(x,50,x,450);
			i = i+1;
			x = x+40;
		}
	}
	
	public void upsidedown()
	{
		int w=200;
		int y=0;
		int i=0;
		int x=150;
		while(i!=5)
		{
			rect(x, y, w, 50);
			y= y +50;
			w= w-30;
			x = x+15;
			i = i+1;
		}
	}

	public void rainbowcirclessquare()
	{
		colorMode(HSB);
		int i =25;
		int c =0;
		int d=0;
		int y=25;
		int counter=0;
		int change=75;
		background(255);		
		noStroke();
		ellipse(25, 25, 50, 50);



		for (i=25;i<500;i=i+50)
		{
			fill(c,255,255);
			ellipse(i, 25, 50, 50);
			c= c+10;

			d=counter;
			for (y=25;y<500;y=y+50)
			{

				fill(d,255,255);
				ellipse(y, change, 50, 50);
				d= d+10;	
			}	
		change =change +50;
		counter=counter+10;
		
		}

	}

	public void squares()
	{
		background(0,0,255);		
		noStroke();
		int i=25;
		int j=0;
		int y=25;
		int counter=0;
		
		fill(0,0,153);


		for (i=25;i<500;i=i+50)
		{
			rect(i, 0, 25, 25);
			
			for(j=counter;j<500;j=j+50)
			{
				rect(j, y, 25, 25);
			}

			y = y+25;
			if(counter==0)
			{
				counter= 25;
			}
			else{
				counter =0;
			}
		}
	}
}
