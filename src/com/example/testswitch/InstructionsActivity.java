package com.example.testswitch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class InstructionsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
	    final Animation animTranslate = AnimationUtils.loadAnimation(this, R.layout.animation_translate);
        Button btnTranslate = (Button)findViewById(R.id.backB);
        Button backBut = (Button) findViewById(R.id.backB);

        backBut.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
				finish();
			}
		});
        
        btnTranslate.setOnClickListener(new Button.OnClickListener(){
      	@Override
      	public void onClick(View arg0) {
      		arg0.startAnimation(animTranslate);
      		finish();
      	  }
      	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_instructions, menu);
        return true;
    }
    
}