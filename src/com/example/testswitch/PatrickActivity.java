package com.example.testswitch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
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

public class PatrickActivity extends Activity {
	public int item = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patrick);
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
	
		
		


		 
		 final String fraze2[] = getResources().getStringArray(R.array.frazeArraythree);  
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
		    		 	if (item == fraze2.length){
			    			 
			    			 item = item + 1;
			    			 if (item > fraze2.length){
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
			    		 if(item < fraze2.length){
			    			 item=item%fraze2.length;
					            newText.setText(fraze2 [item]);
					            f.setImageResource(storyPicArr3 [item]);
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
			        	newText.setText(fraze2 [item]);
			            f.setImageResource(storyPicArr3 [item]);
			            item--; 
			        }
			        	
			        	else {
			            	finish();	
			            }
			           
			            }
	    	  });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_patrick, menu);
		return true;
	}

}
