package com.example.testswitch;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class PuzzleActivityThree extends Activity {
	private int first = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_puzzle);
		
		Bitmap source = BitmapFactory.decodeResource(this.getResources(), R.drawable.titlepage);
		final Bitmap[] tiles;
		final Bitmap[] randomTiles;

		//create the puzzle pieces and add them to an array
		int width; int height; int twidth; int theight;
		width = source.getWidth(); height = source.getHeight(); twidth = width/3; theight = height/3;
		Bitmap p1 = Bitmap.createBitmap(source, 0, 0, twidth, theight);
		Bitmap p2 = Bitmap.createBitmap(source, twidth, 0, twidth, theight);
		Bitmap p3 = Bitmap.createBitmap(source, 2*twidth, 0, twidth, theight);
		Bitmap p4 = Bitmap.createBitmap(source, 0, theight, twidth, theight);
		Bitmap p5 = Bitmap.createBitmap(source, twidth, theight, twidth, theight);
		Bitmap p6 = Bitmap.createBitmap(source, 2*twidth, theight, twidth, theight);
		Bitmap p7 = Bitmap.createBitmap(source, 0, 2*theight, twidth, theight);
		Bitmap p8 = Bitmap.createBitmap(source, twidth, 2*theight, twidth, theight);
		Bitmap p9 = Bitmap.createBitmap(source, 2*twidth, 2*theight, twidth, theight);
		tiles = new Bitmap[]{p1, p2, p3, p4, p5, p6, p7, p8, p9};
		randomTiles = new Bitmap[]{p1, p2, p3, p4, p5, p6, p7, p8, p9};
		
		for (int i = 0; i < randomTiles.length; i++) {
			if ((int)Math.random()*2 == 0) {
				int swapTo = (int)(Math.random()*randomTiles.length);
				if (swapTo != i) {
					Bitmap temp = randomTiles[i];
					randomTiles[i] = randomTiles[swapTo];
					randomTiles[swapTo] = temp;
				}
			}
		}
		
		final GridView grid = (GridView) findViewById(R.id.gridView);
		final ImageAdapter images = new ImageAdapter(this);
		images.setImages(tiles, randomTiles);
	    grid.setAdapter(images);
	    
	    grid.setOnItemClickListener(new OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	            if(first < 0)
	                first = position; // Begin swap
	            else {
	                Bitmap temp = randomTiles[position];
	                randomTiles[position] = randomTiles[first];
	                randomTiles[first] = temp;	                
	                first = -1; // Swap complete
	            }
	            view.refreshDrawableState();
	            images.setImages(tiles, randomTiles);
	            grid.setAdapter(images);
	        }
	    });
	    
		Button btnCheck = (Button)findViewById(R.id.button1);
		btnCheck.setOnClickListener(new View.OnClickListener() {
			@SuppressLint("NewApi")		//suppressed error for API level 12 for sameAs
			@Override 
			public void onClick(View view){
				if (tiles[0].sameAs(randomTiles[0]) == true && tiles[1].sameAs(randomTiles[1]) == true && tiles[2].sameAs(randomTiles[2]) == true && tiles[3].sameAs(randomTiles[3]) == true && tiles[4].sameAs(randomTiles[4]) == true && tiles[5].sameAs(randomTiles[5]) == true && tiles[6].sameAs(randomTiles[6]) == true && tiles[7].sameAs(randomTiles[7]) == true && tiles[8].sameAs(randomTiles[8])) {
					Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
					startActivity(intent);
				}
				
			}
		});
	}
}
