package com.example.testswitch;

import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Menu;

public class SecondActivity extends Activity {
	public int item = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		final int[] storyPicArr = {
				R.drawable.day1,
				R.drawable.day2,
				R.drawable.day3,
				R.drawable.day4,
				R.drawable.day5,
				R.drawable.day6,
				R.drawable.day7,
				R.drawable.day8,
				R.drawable.day9,
				R.drawable.day10,
				R.drawable.day11,
				R.drawable.day12,
				R.drawable.day13,
				R.drawable.day14,
				R.drawable.day15,
				R.drawable.day16,
				R.drawable.day17,
				
				};
	/*
		final int[] storyPicArr2 = {
				R.drawable.day1,
				R.drawable.s2day2,
				R.drawable.S2day3,
				R.drawable.S2day4,
				R.drawable.S2day5,
				R.drawable.S2day6,
				R.drawable.S2day7,
				R.drawable.S2day8,
				R.drawable.S2day9,
				R.drawable.S2day10,
				R.drawable.S2day11,
				R.drawable.S2day12,
				R.drawable.S2day13,
				
		
		final int[] storyPicArr4 = {
				R.drawable.jday1,
				R.drawable.jday2,
				R.drawable.jday3,
				R.drawable.jday4,
				R.drawable.jday5,
				R.drawable.jday6,
				R.drawable.jday7,
				R.drawable.jday8,
				R.drawable.jday9,
				R.drawable.jday10,
				R.drawable.jday11,
				R.drawable.jday12,
				R.drawable.jday13,	
				};

*/
		final int[] storyPicArr3 = {
				R.drawable.patday1,
				R.drawable.patday2,
				R.drawable.patday3,
				R.drawable.patday4,
				R.drawable.patday5,
				R.drawable.patday6,
				R.drawable.patday7,
				R.drawable.patday8,				
				};
		 final String fraze[] = getResources().getStringArray(R.array.frazeArray);  
		 final String fraze2[] = getResources().getStringArray(R.array.frazeArraytwo);  
	     final TextView newText = (TextView) findViewById(R.id.textchanger);
	     final Animation animTranslate = AnimationUtils.loadAnimation(this, R.layout.animation_translate);
	     final ImageView f = (ImageView) findViewById(R.id.ImageSwitch);
	     
	       Button btnTranslate = (Button)findViewById(R.id.backB);
	       Button btnPrev = (Button)findViewById(R.id.backPage);
	       
		   
	      
	        
	       Button btnNext=(Button)findViewById(R.id.btnChange);
	       
		    btnNext.setOnClickListener(new View.OnClickListener() {
		    	int n = 0;
		    	 @Override
		        public void onClick(View v) {
		    		 if (item == fraze.length){
		    			 
		    			 item = item + 1;
		    			 if (item > fraze.length){
		    				/*
		    				 //new story for Patrick
		    				if (item == fraze2.length){
				    			 
				    			 item = item + 1;
				    			 if (item > fraze2.length){
				    				 //finish();
				    				 
				    			 }
				    			 if(item < fraze2.length){
					    			 item=item%fraze.length;
							            newText.setText(fraze2 [item]);
							            f.setImageResource(storyPicArr3 [item]);
							            item++;
		
					    		 }
				    			 
				    		 }
		    				*/
		    				 
		    				Intent homeScreen = new Intent(getApplicationContext(), ChooseStoryActivity.class);
		    				   startActivity(homeScreen);
		    				 
		    			 }
		    			 
		    		 }
		    		 if(item < fraze.length){
		    			 item=item%fraze.length;
				            newText.setText(fraze [item]);
				            f.setImageResource(storyPicArr [item]);
				            item++;
		    			 
		    			 
		    		 }
		    		    
		    		    

			           
			          
			           /*Drawable d = getResources().getDrawable(storyPicArr[n]);
			           f.setImageDrawable(d);
		        if (item < fraze.length){
		        	 item=item%fraze.length; 
		     item++;
		     newText.setText(fraze [item]);
	         f.setImageResource(storyPicArr [item]);          
		        	
		        }	
		        else {
		        		
		        		finish();
		        	}*/
		            }
		                   });
		    
		   

	      btnTranslate.setOnClickListener(new Button.OnClickListener(){

	  @Override
	  public void onClick(View arg0) {
	   arg0.startAnimation(animTranslate);
	   Intent homeScreen = new Intent(getApplicationContext(), MainActivity.class);
	    startActivity(homeScreen);
	  }});
	      
	      
	      
	  btnPrev.setOnClickListener(new Button.OnClickListener(){

	    		 
			        public void onClick(View v) {
			        if(item >= 1){
			        	newText.setText(fraze [item]);
			            f.setImageResource(storyPicArr [item]);
			            item--; 
			        }
			        	
			        	else {
			            	finish();	
			            }
			           
			            }
	    	  });
	   }
	public void swapPuzzle(View view) {
    	Intent intent = new Intent(this, SwapActivity.class);
    	startActivity(intent);
    }
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}