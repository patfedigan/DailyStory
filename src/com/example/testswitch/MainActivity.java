package com.example.testswitch;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 final Animation animTranslate = AnimationUtils.loadAnimation(this, R.layout.animation_translate);
	     final Animation animAlpha = AnimationUtils.loadAnimation(this, R.layout.animation_opacity);
	     final Animation animScale = AnimationUtils.loadAnimation(this, R.layout.animation_scale);
	     final Animation animRotate = AnimationUtils.loadAnimation(this, R.layout.animation_rotate);
	     //Button btnTranslate = (Button)findViewById(R.id.scale);
	        //Button btnAlpha = (Button)findViewById(R.id.alpha);
	        Button btnScalez = (Button)findViewById(R.id.AboutButton);
	        Button btnScalex = (Button)findViewById(R.id.InstructionsButton);
	        Button btnScale = (Button)findViewById(R.id.btnNextScreen);
	       // Button btnRotate = (Button)findViewById(R.id.rotate);
 	btnScale.setOnClickListener(new Button.OnClickListener(){

 			   @Override
 			   public void onClick(View arg0) {
 			    arg0.startAnimation(animScale);
 			    Intent nextScreen = new Intent(getApplicationContext(), ChooseStoryActivity.class);
 			    startActivity(nextScreen);
 			   }});
	btnScalex.setOnClickListener(new Button.OnClickListener(){

		   @Override
		   public void onClick(View arg0) {
		    arg0.startAnimation(animScale);
		    Intent nextScreen = new Intent(getApplicationContext(), InstructionsActivity.class);
		    startActivity(nextScreen);
		   }});
	
	btnScalez.setOnClickListener(new Button.OnClickListener(){

		   @Override
		   public void onClick(View arg0) {
		    arg0.startAnimation(animScale);
		    Intent nextScreen = new Intent(getApplicationContext(), AboutActivity.class);
		    startActivity(nextScreen);
		   }});
        
	}
	
	  public void Instructions(View view) {
	    	Intent intent = new Intent(this, InstructionsActivity.class);
	    	startActivity(intent);
	    	
	    }
	    public void About(View view) {
	    	Intent intent = new Intent(this, AboutActivity.class);
	    	startActivity(intent);
	    }
	    public void PlayNow(View view) {
	    	Intent intent = new Intent(this, ChooseStoryActivity.class);
	    	startActivity(intent);
	    }

	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	/*
	   //There might be a prettier or better way to make popup messages, but for now, bam.
		public void instrucTion(View view){
	   	  new AlertDialog.Builder(this).setTitle("Instructions").setMessage("1. Go Jump off a Cliff" + "\n" + "2. Fly like a bird" + "\n" + "3. Belly-flop" ).setNeutralButton("Exit", null).show();
	   	 }
	*/
	
}
