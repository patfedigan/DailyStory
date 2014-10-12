package com.example.testswitch;

import android.os.Bundle;
import android.graphics.Bitmap;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.GridView;

public class SwapActivity extends Activity {
/** Called when the activity is first created. */
int i=0;
int first = -1;
int firstClick,secondClick;
GridView gridView;

public Integer[] mThumbIds = {
        R.drawable.day1,   R.drawable.day4,       R.drawable.day7,
        R.drawable.day2,    R.drawable.day5,          R.drawable.day8,
        R.drawable.day3, R.drawable.day6,          R.drawable.day9
        };

Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.day1);
Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.day2);
Bitmap[] chunkedImages = new Bitmap[]{one, two};

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_swap);

    gridView = (GridView)findViewById(R.id.gridview);
    gridView.setAdapter(new ImageAdapter(this));
    final ImageAdapter im = new ImageAdapter(this);
    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @SuppressLint("UseValueOf")
		public void onItemClick2(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
        	if (first < 0) {
        		first = arg2;
        	} else {
        		Bitmap swap = chunkedImages[arg2];
        		//chunkedImages.set(arg2, chunkedImages[arg2]);
        		//chunkedImages.set(first, swapImage);
        		first = -1;
        	}
        	
            // TODO Auto-generated method stub
            i++;
            if( i %2!=0){
                firstClick=arg2;
            }else{
                secondClick=arg2;
                Integer [] mThumbIds = null;
				Integer help;
				help = mThumbIds[firstClick];
                mThumbIds[firstClick]=mThumbIds[secondClick];
                mThumbIds[secondClick]=help;
                
                notifyDataSetChanged();
                System.out.println("Second Click "+i);
            }

        }

		private void notifyDataSetChanged() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}
    });
}}