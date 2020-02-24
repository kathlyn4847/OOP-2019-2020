package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sound1 extends PApplet
{	
	Minim minim;
	AudioInput ai;

	public void settings()
	{
		size(1024, 500);
	}

	public void setup() 
	{
		minim = new Minim(this);
		ai = minim.getLineIn(Minim.MONO, width, 44100, 16);

		colorMode(HSB);
	}

	
	public void draw()
	{	
		float sum = 0;
		float average = sum / ai.bufferSize();
		float cy = height / 2;
		float w = average * cy;
		float cx = w/2;
		float circy;
		float lerpedcircy;
		float lerpedw;
		lerpedw = lerp(lerpedw,w, )
		background(0);		
		stroke(255);
		fill(
			map(average , 0, 1, 0 , 255)
			, 255
			, 255
		);
		
		
		// for(int i = 0 ; i < ai.bufferSize() ; i ++)
		// {
		// 	stroke(
		// 		map(i, 0, ai.bufferSize(), 0, 255)
		// 		, 255
		// 		, 255
		// 	);
		// 	//line(i, cy, i, cy + ai.left.get(i) * cy);
		// 	sum += abs(ai.left.get(i));
		// }
		

		ellipse(cx ,cy, w, w);
		ellipse(cx ,cy, lerpedw, lerpedw);
	

		circy += random (-20,20);
		lerpedcircley = lerp(circyley, circy , 0.1f);
		ellipse(100, circy ,50, 50);
		ellipse(200, lerpedcircley ,50, 50);
	}
}


//lerp(a,b,t)
//get a+(b-a)t
