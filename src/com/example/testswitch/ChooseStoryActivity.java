package com.example.testswitch;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ChooseStoryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_story);
		
		 

	}
	 public void storyOne(View view) {
	    	Intent intent = new Intent(this, TitleScreen.class);
	    	startActivity(intent);
	    	
	    }
	    public void storyTwo(View view) {
	    	Intent intent = new Intent(this, TitleScreen2.class);
	    	startActivity(intent);
	    }
	    public void storyThree(View view) {
	    	Intent intent = new Intent(this, TitleScreen3.class);
	    	startActivity(intent);
	    }
	    public void storyFour(View view) {
	    	Intent intent = new Intent(this, TitleScreen4.class);
	    	startActivity(intent);
	    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_choose_story, menu);
		return true;
	}

}
